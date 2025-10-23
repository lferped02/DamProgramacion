# Listas para almacenar los datos
nombres = []
puntuaciones = []
generos = []

# Bucle principal
while True:
    # Mostrar menú
    print("Selecciona una de las siguientes opciones (R, E, S)")
    print("R. Registrar juegos")
    print("E. Mostrar estadísticas")
    print("S. Salir del programa")

    opcion = input("Opción: ").strip().lower()

    # Registrar juegos
    if opcion == 'r':
        print("Registrando...")
        try:
            cantidad = int(input("¿Cuántos juegos quieres registrar? "))
            for i in range(cantidad):
                print(f"Juego {i + 1}:")
                nombre = input("Nombre del juego: ")

                while True:
                    try:
                        puntuacion = int(input("Puntuación (1 a 10): "))
                        if 1 <= puntuacion <= 10:
                            break
                        else:
                            print("La puntuación debe estar entre 1 y 10.")
                    except ValueError:
                        print("Por favor, introduce un número válido.")

                genero = input("Género (Acción, RPG, Deportes…): ")

                nombres.append(nombre)
                puntuaciones.append(puntuacion)
                generos.append(genero)
        except ValueError:
            print("Por favor, introduce un número válido.")

    # Mostrar estadísticas
    elif opcion == 'e':
        print("Estadísticas")
        if not nombres:
            print("No hay juegos registrados aún.")
        else:
            print("Tu colección de juegos PSP:")
            for i in range(len(nombres)):
                print(f"{i + 1}. {nombres[i]} | Puntuación: {puntuaciones[i]} | Género: {generos[i]}")

    # Salir del programa
    elif opcion == 's':
        print("Saliendo del programa. ¡Hasta luego!")
        break

    # Opción inválida
    else:
        print("Opción no válida. Intenta de nuevo.")
