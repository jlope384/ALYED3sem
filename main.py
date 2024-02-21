#Universidad del Valle de Guatemala
#Algoritmos y estructura de Datos
#Hoja de Trabajo No. 3

import random
import sorts as sorts
import timeit
import cProfile

"La funcion genera un arreglo de 3000 numeros aleatorios entre 1 y 10000 y lo retorna"
def generatorRandom():
    array = [random.randint(1, 10000) for j in range(300000)] 
    return array 

"La funcion ejecuta los algoritmos de ordenamiento y mide el tiempo que tarda en ejecutar cada uno de ellos"
def run_algorithms(ascDescBoolean): 
    numerosAleatorios = generatorRandom()

    #QuickSort
    start_time = timeit.default_timer()
    sorts.quickSort(numerosAleatorios, 0, len(numerosAleatorios) - 1, ascDescBoolean)
    print("quickSort:", timeit.default_timer() - start_time, "seconds") 

    #GnomeSort
    start_time = timeit.default_timer()
    sorts.gnomeSort(numerosAleatorios, ascDescBoolean)
    print("gnomeSort:", timeit.default_timer() - start_time, "seconds")

    #HeapSort
    start_time = timeit.default_timer()
    sorts.heapSort(numerosAleatorios, ascDescBoolean)
    print("heapSort:", timeit.default_timer() - start_time, "seconds")

    #MergeSort
    start_time = timeit.default_timer()
    sorts.mergeSort(numerosAleatorios, ascDescBoolean)
    print("mergeSort:", timeit.default_timer() - start_time, "seconds")

    #RadixSort
    start_time = timeit.default_timer()
    sorts.radixSort(numerosAleatorios, ascDescBoolean)
    print("radixSort:", timeit.default_timer() - start_time, "seconds")

    #SelectionSort
    start_time = timeit.default_timer()
    sorts.selectionSort(numerosAleatorios, ascDescBoolean)
    print("selectionSort:", timeit.default_timer() - start_time, "seconds")

    #ShellSort
    start_time = timeit.default_timer()
    sorts.shellSort(numerosAleatorios, ascDescBoolean)
    print("shellSort:", timeit.default_timer() - start_time, "seconds")

"El usuario elige si quiere ordenar los numeros de manera ascendente o descendente y se ejecutan los algoritmos de ordenamiento con base en la eleccion del usuario"
menu = int(input("1. Ordenar ascendente\n2. Ordenar descendente\n"))
if menu == 1:
    ascDescBoolean = True
elif menu == 2:
    ascDescBoolean = False
else:
    print("Opcion no valida")

numerosAleatorios = generatorRandom() 
run_algorithms(ascDescBoolean) 
cProfile.run('run_algorithms(ascDescBoolean)') #Se ejecuta el profiler para medir el tiempo de ejecucion de cada algoritmo de ordenamiento
