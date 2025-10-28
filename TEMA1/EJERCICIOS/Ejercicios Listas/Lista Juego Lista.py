# Listas para almacenar los datos
nombres = ["God of War: Chains of Olympus", "Patapon", "FIFA 20", "Grand Theft Auto: Vice City Stories"]
puntuaciones = [9, 8, 7, 8]
generos = ["Accion", "Estrategia", "Deporte", "Accion"]
maximo = []
buscar = []
# Bucle principal
seguir = True
while seguir:
    # Mostrar menú
    print("Selecciona una de las siguientes opciones (R, E, S)")
    print("R. Registrar juegos")
    print("E. Mostrar estadisticas")
    print("P. Mejor puntuacion")
    print("D. Detalle de un juego")
    print("G. Mostrar juegos de un genero")
    print("S. Salir del programa")

    opcion = input("Opcion: ").strip().lower()

    # Registrar juegos
    if opcion == 'r':
        print("Registrando...")
        cantidad_valida = False
        while not cantidad_valida:
            cantidad_input = input("¿Cuantos juegos quieres registrar? ")
            if cantidad_input.isdigit():
                cantidad = int(cantidad_input)
                cantidad_valida = True
            else:
                print("Por favor, introduce un numero valido.")

        for i in range(cantidad):
            print(f"Juego {i + 1}:")
            nombre = input("Nombre del juego: ")

            puntuacion_valida = False
            while not puntuacion_valida:
                puntuacion_input = input("Puntuacion (1 a 10): ")
                if puntuacion_input.isdigit():
                    puntuacion = int(puntuacion_input)
                    if 1 <= puntuacion <= 10:
                        puntuacion_valida = True
                    else:
                        print("La puntuacion debe estar entre 1 y 10.")
                else:
                    print("Por favor, introduce un numero valido.")

            genero = input("Género (Acción, RPG, Deportes…): ")

            nombres.append(nombre)
            puntuaciones.append(puntuacion)
            generos.append(genero)

    # Mostrar estadísticas
    elif opcion == 'e':
        print("Estadisticas")
        if len(nombres) == 0:
            print("No hay juegos registrados aun.")
        else:
            print("Tu coleccion de juegos PSP:")
            for i in range(len(nombres)):
                print(f"{i + 1}. {nombres[i]} | Puntuacion: {puntuaciones[i]} | Genero: {generos[i]}")
    
    #Juego con mayor puntuación
    elif opcion == 'p':
        maximo = 0
        for puntuacion in puntuaciones:
            if puntuacion > maximo:
              maximo = puntuacion
        posicion = puntuaciones.index(maximo)
        print(f"{i + 1}. {nombres[i]} | Puntuacion: {puntuaciones[i]} | Genero: {generos[i]}")
    
    #Detalle de un juego
    elif opcion == 'd':
        buscar = input("Introduce el nombre del juego: ")
        if buscar in nombres:
            i = nombres.index(buscar)
            print(f"{i + 1}. {nombres[i]} | Puntuacion: {puntuaciones[i]} | Genero: {generos[i]}")
        else:
            print("El juego no está en la lista de búsqueda.")

    #Mostrar juegos de un género
    elif opcion == 'g':
        generoJuego = input("Filtra el género: ")
        encontrados = False
        for i in range(len(generos)):
            if generos[i].lower() == generoJuego.lower():
                print(f"{i + 1}. {nombres[i]} | Puntuación: {puntuaciones[i]} | Género: {generos[i]}")
                encontrados = True
        if not encontrados:
            print("No hay juegos para ese género en la lista del sistema")

    # Salir del programa
    elif opcion == 's':
        print("Saliendo del programa. ¡Hasta luego!")
        seguir = False

    # Opción inválida
    else:
        print("Opcion no valida. Intenta de nuevo.")
