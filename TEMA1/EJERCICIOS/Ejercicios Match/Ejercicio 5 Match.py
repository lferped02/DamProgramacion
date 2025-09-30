print ("Listado de habitaciones:")
print ("1. Azul - 2 camas - Planta Primera")
print ("2. Roja - 1 cama - Planta Primera")
print ("3. Verde - 3 camas - Planta Segunda")
print ("4. Rosa - 2 camas - Planta Segunda")
print ("5. Gris - 1 cama - Planta Tercera")

numero = int(input("Introduce el número de habitación (1-5): "))
match numero:
    case 1:
         print("Habitación Azul: Planta Primera, 2 camas")
    case 2:
        print("Habitación Roja: Planta Primera, 1 cama")
    case 3:
        print("Habitación Verde: Planta Segunda, 3 camas")
    case 4:
        print("Habitación Rosa: Planta Segunda, 2 camas")
    case 5:
        print("Habitación Gris: Planta Tercera, 1 cama")
    case _:
        print("Número de habitación no válido.")