# Codigos generados por IA, proporcionados por compañeros de clase

def gnomeSort(arr, ascending):
    index = 0
    while index < len(arr):
        if index == 0 or (arr[index] >= arr[index - 1] if ascending else arr[index] <= arr[index - 1]):
            index += 1
        else:
            arr[index], arr[index - 1] = arr[index - 1], arr[index]
            index -= 1
    return arr

def heapify(arr, n, i, ascending):
    largest_smallest = i  # Inicializa el más grande como raíz o el más pequeño dependiendo de ascending
    left = 2 * i + 1     # izquierda = 2*i + 1
    right = 2 * i + 2    # derecha = 2*i + 2

    # Cambia según si es ascendente o descendente
    if ascending:
        # Si el hijo izquierdo es mayor que la raíz
        if left < n and arr[left] > arr[largest_smallest]:
            largest_smallest = left

        # Si el hijo derecho es mayor que el más grande hasta ahora
        if right < n and arr[right] > arr[largest_smallest]:
            largest_smallest = right
    else:
        # Si el hijo izquierdo es menor que la raíz
        if left < n and arr[left] < arr[largest_smallest]:
            largest_smallest = left

        # Si el hijo derecho es menor que el más pequeño hasta ahora
        if right < n and arr[right] < arr[largest_smallest]:
            largest_smallest = right

    # Si el más grande (o el más pequeño para descendente) no es la raíz
    if largest_smallest != i:
        arr[i], arr[largest_smallest] = arr[largest_smallest], arr[i]  # swap

        # Heapify la raíz afectada.
        heapify(arr, n, largest_smallest, ascending)

def heapSort(arr, ascending):
    n = len(arr)

    # Construir un montón (reorganizar el arreglo)
    for i in range(n // 2 - 1, -1, -1):
        heapify(arr, n, i, ascending)

    # Extraer elementos uno por uno
    for i in range(n-1, 0, -1):
        arr[i], arr[0] = arr[0], arr[i]  # swap
        heapify(arr, i, 0, ascending)
        
    return arr


def mergeSort(arr, ascending):
    if len(arr) > 1:
        mid = len(arr) // 2
        left_half = arr[:mid]
        right_half = arr[mid:]

        # Pasar el parámetro ascending a las llamadas recursivas
        mergeSort(left_half, ascending)
        mergeSort(right_half, ascending)

        i = j = k = 0

        # Comparación y fusión de las dos mitades ordenadas teniendo en cuenta el orden deseado
        while i < len(left_half) and j < len(right_half):
            if (left_half[i] < right_half[j] if ascending else left_half[i] > right_half[j]):
                arr[k] = left_half[i]
                i += 1
            else:
                arr[k] = right_half[j]
                j += 1
            k += 1

        # Verificar elementos restantes en ambas mitades
        while i < len(left_half):
            arr[k] = left_half[i]
            i += 1
            k += 1

        while j < len(right_half):
            arr[k] = right_half[j]
            j += 1
            k += 1

    return arr

def partition(arr, low, high, ascending):
    # Tomamos el último elemento como pivote
    pivot = arr[high]
    i = low - 1  # Índice del elemento más pequeño o más grande dependiendo del orden

    for j in range(low, high):
        if ascending:
            # Si el elemento actual es menor o igual que el pivote
            condition = arr[j] <= pivot
        else:
            # Si el elemento actual es mayor o igual que el pivote (para orden descendente)
            condition = arr[j] >= pivot

        if condition:
            # Incrementamos el índice del elemento más pequeño o más grande
            i += 1
            # Intercambiamos arr[i] con arr[j]
            arr[i], arr[j] = arr[j], arr[i]

    # Intercambiamos arr[i+1] con arr[high] (el pivote)
    arr[i+1], arr[high] = arr[high], arr[i+1]
    return i+1

def quickSort(arr, low, high, ascending):
    if low < high:
        # Encuentra el índice del pivote después de la partición, considerando el orden
        pi = partition(arr, low, high, ascending)

        # Ordena los elementos antes y después del pivote
        quickSort(arr, low, pi-1, ascending)
        quickSort(arr, pi+1, high, ascending)
        
    return arr
def countingSort(arr, digit, n):
    output = [0] * n
    count = [0] * 10

    for i in range(n):
        index = arr[i] // digit
        count[int(index % 10)] += 1

    for i in range(1, 10):
        count[i] += count[i - 1]

    i = n - 1
    while i >= 0:
        index = arr[i] // digit
        output[count[int(index % 10)] - 1] = arr[i]
        count[int(index % 10)] -= 1
        i -= 1

    for i in range(n):
        arr[i] = output[i]

def radixSort(arr, ascending=True):
    n = len(arr)
    max_val = max(arr)
    digit = 1
    while max_val // digit > 0:
        countingSort(arr, digit, n)
        digit *= 10

    if not ascending:
        arr.reverse()

    return arr


def selectionSort(arr, ascending):
    n = len(arr)

    for i in range(n):
        # Encontrar el índice extremo en el resto de la lista
        extreme_index = i
        for j in range(i+1, n):
            if ascending:
                condition = arr[j] < arr[extreme_index]
            else:
                condition = arr[j] > arr[extreme_index]

            if condition:
                extreme_index = j

        # Intercambiar el elemento extremo encontrado con el primer elemento no ordenado
        arr[i], arr[extreme_index] = arr[extreme_index], arr[i]
    return arr


def shellSort(arr, ascending):
    n = len(arr)
    gap = n // 2
    while gap > 0:
        for i in range(gap, n):
            temp = arr[i]
            j = i
            while j >= gap and ((arr[j - gap] > temp if ascending else arr[j - gap] < temp)):
                arr[j] = arr[j - gap]
                j -= gap
            arr[j] = temp
        gap //= 2
    return arr