import cProfile
from main import generatorRandom
import sorts

def run_algorithms():
    numerosAleatorios = generatorRandom()
    ascDescBoolean = False

    profiler = cProfile.Profile()
    profiler.enable()
    print(sorts.quickSort(numerosAleatorios, 0, len(numerosAleatorios) - 1, ascDescBoolean))
    profiler.disable()
    profiler.print_stats()

    profiler = cProfile.Profile()
    profiler.enable()
    sorts.gnomeSort(numerosAleatorios, ascDescBoolean)
    profiler.disable()
    profiler.print_stats()

    profiler = cProfile.Profile()
    profiler.enable()
    sorts.heapSort(numerosAleatorios, ascDescBoolean)
    profiler.disable()
    profiler.print_stats()