print ("Listado de habitaciones:")
print ("-Habitacion--Camas--Plantas-")
print("-----------------------------------")
print ("1. Azul -------2---Planta Primera")
print ("2. Roja -------1---Planta Primera")
print ("3. Verde ------3---Planta Segunda")
print ("4. Rosa -------2---Planta Segunda")
print ("5. Gris -------1---Planta Tercera")
print("-----------------------------------")

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