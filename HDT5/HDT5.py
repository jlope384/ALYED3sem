#Universidad del Valle de Guatemala
#Algoritmos y estructura de datos
#Seccion 20
#Javier Lopez - 23415

import simpy
import random
import statistics
import matplotlib.pyplot as plt

# Parámetros de la simulación
RANDOM_SEED = 42 
CPU_SPEED = 3  # Número de instrucciones que puede ejecutar el CPU en una unidad de tiempo
MEMORY_CAPACITY = 100 # Capacidad de la memoria RAM
INTERVAL = 10 # Intervalo de tiempo para la generación de nuevos procesos

# Inicialización de SimPy
random.seed(RANDOM_SEED)
env = simpy.Environment()

# Recursos
RAM = simpy.Container(env, init=MEMORY_CAPACITY, capacity=MEMORY_CAPACITY)
CPU = simpy.Resource(env, capacity=2) # Capacidad del CPU (2 proceso a la vez)

# Listas para almacenar tiempos de ejecución
tiempos_ejecucion_promedio = []
tiempos_ejecucion_desviacion = []
num_procesos = [25, 50, 100, 150, 200]

# Función para el ciclo de vida del proceso
def ciclo_vida_proceso(env, nombre, instrucciones_totales, memoria_requerida):
    global tiempos_ejecucion

    # Estado 'new'
    yield env.timeout(random.expovariate(1.0 / INTERVAL))
    
    # Estado 'ready'
    with RAM.get(memoria_requerida) as req:
        yield req

    # Estado 'running'
    instrucciones_restantes = instrucciones_totales
    while instrucciones_restantes > 0:
        with CPU.request() as req:
            yield req
            yield env.timeout(1)  # Tiempo de atención del CPU
            instrucciones_restantes -= min(CPU_SPEED, instrucciones_restantes)

    # Estado 'terminated' o 'waiting' o 'ready'
    if instrucciones_restantes == 0:
        tiempos_ejecucion.append(env.now)

        # Terminated
        RAM.put(memoria_requerida)
    else:
        # Waiting o Ready
        if random.randint(1, 2) == 1:
            env.process(ciclo_vida_proceso(env, nombre, instrucciones_restantes, memoria_requerida))
        else:
            env.process(ciclo_vida_proceso(env, nombre, instrucciones_restantes, memoria_requerida))

# Ejecución de la simulación para diferentes cantidades de procesos
for num_proceso in num_procesos:
    tiempos_ejecucion = []  # Reiniciar la lista para cada simulación
    for i in range(num_proceso):
        env.process(ciclo_vida_proceso(env, f'Proceso {i}', random.randint(1, 10), random.randint(1, 10)))

    env.run(until=env.now + 100)  # Establecer un tiempo límite para la simulación

    # Calcular y almacenar resultados
    tiempo_promedio = statistics.mean(tiempos_ejecucion)
    desviacion_estandar = statistics.stdev(tiempos_ejecucion)

    tiempos_ejecucion_promedio.append(tiempo_promedio)
    tiempos_ejecucion_desviacion.append(desviacion_estandar)

    print(f'Número de procesos: {num_proceso}')
    print(f'Tiempo promedio de ejecución: {tiempo_promedio:.2f} unidades de tiempo')
    print(f'Desviación estándar: {desviacion_estandar:.2f}')
    print()

# Gráfica
plt.errorbar(num_procesos, tiempos_ejecucion_promedio, yerr=tiempos_ejecucion_desviacion, fmt='o-', capsize=5)
plt.xlabel('Número de procesos')
plt.ylabel('Tiempo promedio de ejecución')
plt.title('Relación entre el número de procesos y el tiempo promedio de ejecución')
plt.show()
