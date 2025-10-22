import random

# Diccionario para contar alumnos por casa
casas = {
    "Gryffindor": 0,
    "Slytherin": 0,
    "Hufflepuff": 0,
    "Ravenclaw": 0
}

# Lista de casas para asignación aleatoria
lista_casas = ["Gryffindor", "Slytherin", "Hufflepuff", "Ravenclaw"]

# Contador total de alumnos
total_alumnos = 0

# Bucle principal
while True:
    print("=============================")
    print("  SOMBRERO SELECCIONADOR")
    print("=============================")
    print("1. Seleccionar casa para un alumno")
    print("2. Mostrar estadísticas")
    print("Elige una opción. Si quieres salir del programa, escribe la opción 1 y el nombre del personaje innombrable")

    # Validación de opción
    opcion = input("Opción (1 o 2): ")
    while opcion not in ["1", "2"]:
        print("Opción inválida. Intenta de nuevo.")
        opcion = input("Opción (1 o 2): ")

    if opcion == "1":
        print("Ejecutando y seleccionando casa")
        nombre = input("Nombre del alumno: ")

        # Salida si el nombre es Voldemort
        if nombre.strip().lower() == "voldemort":
            print("Apparition, transpórtame a otro sitio")
            break

        # Asignación aleatoria de casa
        numero_casa = random.randint(0, 3)
        casa_asignada = lista_casas[numero_casa]
        print(f"El Sombrero dice que {nombre} pertenece a {casa_asignada}")

        # Actualizar estadísticas
        casas[casa_asignada] += 1
        total_alumnos += 1

    elif opcion == "2":
        print("Ejecutando y mostrar estadísticas")
        if total_alumnos == 0:
            print("Aún no hay alumnos registrados.")
        else:
            print("\n📊 Estadísticas:")
            print(f"Total de alumnos: {total_alumnos}")
            print(f"Gryffindor: {casas['Gryffindor']}")
            print(f"Slytherin: {casas['Slytherin']}")
            print(f"Hufflepuff: {casas['Hufflepuff']}")
            print(f"Ravenclaw: {casas['Ravenclaw']}")
