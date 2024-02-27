#Universidad del valle de Guatemala
#Organizacion de computadoras y assembler.
#Javier Lopez - 23415
#Daniela Ramirez - 23053
#Laboratorio 05

from Lab05 import *

Menu = True
while Menu:
    print("1. Convertir un número decimal a binarioIE74")
    print("2. Convertir un número binarioIE74 a decimal")
    print("3. Salir")
    opcion = int(input("Ingrese una opción: "))
    if opcion == 1:
        numero = float(input("Ingrese un número decimal: "))
        # Función que convierte un número decimal a binarioIE74
        print(decimal_a_binarioIE74(numero))
    elif opcion == 2:
        numero = input("Ingrese un número binarioIE74: ")
        # Función que convierte un número binarioIE74 a decimal
        if len(numero) != 32:
            print("El número binario debe tener exactamente 32 bits.")
        else:
            print(binarioIE74_a_decimal(numero))
    elif opcion == 3:
        Menu = False
    else:
        print("Opción no válida")