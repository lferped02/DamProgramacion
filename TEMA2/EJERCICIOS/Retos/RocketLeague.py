#Apartado1
def pintarMenu():
    opcion = ""
    while opcion != "S":
        print("A) Registrar puntuaciones de equipo")
        print("L) Listar equipos y su puntuación por fase")
        print("C) Clasificados por fase")
        print("S) Salir")
        opcion = input("Seleccione una opción: ").upper()

def leeValidaOpcion():
    opcion = ""
    while opcion != "S":
        pintarMenu()
        opcion = input("Selecciona una opción: ").upper()

        if opcion == "A":
            print("Has elegido registrar puntuaciones...")
        elif opcion == "L":
            print("Has elegido listar equipos...")
        elif opcion == "C":
            print("Has elegido clasificados por fase...")
        elif opcion == "S":
            print("Saliendo del programa...")
        else:
            print("Opción incorrecta")

#Apartado2
