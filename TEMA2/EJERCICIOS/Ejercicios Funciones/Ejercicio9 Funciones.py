def convertirSegundosAHoras(segundos):
    return int(segundos / 3600)

def convertirSegundosAMinutos(segundos):
    return int(segundos / 60)

menu = int(input("Menú:\n1. Mostrar segundos\n2. Convertir a minutos\n3. Convertir a horas\n4. Salir\nElige una opción: "))

while menu != 4:
    segundos = int(input("Introduce el tiempo en segundos: "))

    if menu == 1:
        print(segundos, "segundos")
    elif menu == 2:
        print(convertirSegundosAMinutos(segundos), "minutos")
    elif menu == 3:
        print(convertirSegundosAHoras(segundos), "horas")
    else:
        print("Opción no válida")

    menu = int(input("\nMenú:\n1. Mostrar segundos\n2. Convertir a minutos\n3. Convertir a horas\n4. Salir\nElige una opción: "))

print("Saliendo del programa...")
