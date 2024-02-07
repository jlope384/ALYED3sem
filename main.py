import random
import sorts as sorts
import timeit
import cProfile

def generatorRandom():
    array = [random.randint(1, 10000) for j in range(3000)]
    return array

def run_algorithms(ascDescBoolean):
    numerosAleatorios = generatorRandom()

    start_time = timeit.default_timer()
    sorts.quickSort(numerosAleatorios, 0, len(numerosAleatorios) - 1, ascDescBoolean)
    print("quickSort:", timeit.default_timer() - start_time, "seconds")

    start_time = timeit.default_timer()
    sorts.gnomeSort(numerosAleatorios, ascDescBoolean)
    print("gnomeSort:", timeit.default_timer() - start_time, "seconds")

    start_time = timeit.default_timer()
    sorts.heapSort(numerosAleatorios, ascDescBoolean)
    print("heapSort:", timeit.default_timer() - start_time, "seconds")

    start_time = timeit.default_timer()
    sorts.mergeSort(numerosAleatorios, ascDescBoolean)
    print("mergeSort:", timeit.default_timer() - start_time, "seconds")

    start_time = timeit.default_timer()
    sorts.radixSort(numerosAleatorios, ascDescBoolean)
    print("radixSort:", timeit.default_timer() - start_time, "seconds")

    start_time = timeit.default_timer()
    sorts.selectionSort(numerosAleatorios, ascDescBoolean)
    print("selectionSort:", timeit.default_timer() - start_time, "seconds")

    start_time = timeit.default_timer()
    sorts.shellSort(numerosAleatorios, ascDescBoolean)
    print("shellSort:", timeit.default_timer() - start_time, "seconds")


menu = int(input("1. Ordenar ascendente\n2. Ordenar descendente\n"))
if menu == 1:
    ascDescBoolean = True
elif menu == 2:
    ascDescBoolean = False
else:
    print("Opcion no valida")

numerosAleatorios = generatorRandom()
run_algorithms(ascDescBoolean)
