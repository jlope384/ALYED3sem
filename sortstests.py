#Universidad del Valle de Guatemala
#Algoritmos y estructura de Datos
#Hoja de Trabajo No. 3

import unittest
import sorts as sorts

class TestSortingAlgorithms(unittest.TestCase):
    def setUp(self):
        self.ascending_list = [1, 2, 3, 4, 5, 6, 7, 8, 9]
        self.descending_list = [9, 8, 7, 6, 5, 4, 3, 2, 1]
        self.unsorted_list = [5, 3, 7, 1, 2, 8, 6, 4, 9]

    "Pruebas para los algoritmos de ordenamiento"
    def test_gnomeSort(self):
        self.assertEqual(sorts.gnomeSort(self.unsorted_list.copy(), True), self.ascending_list) #Se verifica que el arreglo ordenado de manera ascendente sea igual al arreglo ordenado de manera ascendente
        self.assertEqual(sorts.gnomeSort(self.unsorted_list.copy(), False), self.descending_list) #Se verifica que el arreglo ordenado de manera descendente sea igual al arreglo ordenado de manera descendente

    def test_heapSort(self):
        self.assertEqual(sorts.heapSort(self.unsorted_list.copy(), True), self.ascending_list) #Se verifica que el arreglo ordenado de manera ascendente sea igual al arreglo ordenado de manera ascendente
        self.assertEqual(sorts.heapSort(self.unsorted_list.copy(), False), self.descending_list) #Se verifica que el arreglo ordenado de manera descendente sea igual al arreglo ordenado de manera descendente

    def test_mergeSort(self):
        self.assertEqual(sorts.mergeSort(self.unsorted_list.copy(), True), self.ascending_list) #Se verifica que el arreglo ordenado de manera ascendente sea igual al arreglo ordenado de manera ascendente
        self.assertEqual(sorts.mergeSort(self.unsorted_list.copy(), False), self.descending_list) #Se verifica que el arreglo ordenado de manera descendente sea igual al arreglo ordenado de manera descendente

    def test_quickSort(self):
        self.assertEqual(sorts.quickSort(self.unsorted_list.copy(), 0, len(self.unsorted_list) - 1, True), self.ascending_list) #Se verifica que el arreglo ordenado de manera ascendente sea igual al arreglo ordenado de manera ascendente 
        self.assertEqual(sorts.quickSort(self.unsorted_list.copy(), 0, len(self.unsorted_list) - 1, False), self.descending_list) #Se verifica que el arreglo ordenado de manera descendente sea igual al arreglo ordenado de manera descendente

    def test_radixSort(self):
        self.assertEqual(sorts.radixSort(self.unsorted_list.copy(), True), self.ascending_list) #Se verifica que el arreglo ordenado de manera ascendente sea igual al arreglo ordenado de manera ascendente
        self.assertEqual(sorts.radixSort(self.unsorted_list.copy(), False), self.descending_list) #Se verifica que el arreglo ordenado de manera descendente sea igual al arreglo ordenado de manera descendente
 
    def test_selectionSort(self):
        self.assertEqual(sorts.selectionSort(self.unsorted_list.copy(), True), self.ascending_list) #Se verifica que el arreglo ordenado de manera ascendente sea igual al arreglo ordenado de manera ascendente
        self.assertEqual(sorts.selectionSort(self.unsorted_list.copy(), False), self.descending_list) #Se verifica que el arreglo ordenado de manera descendente sea igual al arreglo ordenado de manera descendente

    def test_shellSort(self):
        self.assertEqual(sorts.shellSort(self.unsorted_list.copy(), True), self.ascending_list) #Se verifica que el arreglo ordenado de manera ascendente sea igual al arreglo ordenado de manera ascendente
        self.assertEqual(sorts.shellSort(self.unsorted_list.copy(), False), self.descending_list) #Se verifica que el arreglo ordenado de manera descendente sea igual al arreglo ordenado de manera descendente

if __name__ == '__main__':
    unittest.main()