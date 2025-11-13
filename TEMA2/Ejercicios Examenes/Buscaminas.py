import random
#Pinta menu
def pintarMenu():
    print("T. Genera un nuevo tablero")
    print("J. Genera un el juego en el tablero")
    print("E. Salir del juego")

#Lee y valida opcion
def leeValidaOpcion():
    pintarMenu()
    opcion=input("Selecciona una opcion: ")
    while opcion !="T" and opcion !="J" and opcion !="E":
        opcion=input("Selecciona una opcion: ")
    while opcion !="E":
        if opcion=="T":
            resultados = cargaTablero()
        elif opcion=="J":
            juega(resultados[0], resultados[1])
        pintarMenu()
        opcion=input("Selecciona una opcion: ")
    ejecutaTerminar()

#Carga tablero
def cargaTablero():
    tablero = []
    minas = 0
    for i in range(0,8):
        aleatorio = random.randint(0,1)
        if aleatorio==0:
            tablero.append("")
        elif aleatorio==1:
            tablero.append("X")
            minas+=1
    print(f"Tablero generado. Se han escondido {minas} minas. Tablero {tablero}")
    return tablero, minas

#Juega
def juega(tablero, minas):
    print("Jugando")
    puntuacion=0
    historico=[]
    while minas !=0:
        usuario=int(input("Introduce una posicion(1-8): "))
        while usuario>8:
            usuario=int(input("Introduce una posicion(1-8): "))
        if usuario in historico:
            print("Posicion revisada")
        else:    
            historico.append(usuario)
            if tablero[usuario]=="X":
                puntuacion+=1
                minas-=1
                print(f"¡MINA! Puntuacion: {puntuacion} | MinasRestantes: {minas}")
            else:
                puntuacion-=1
                print(f"AGUA! Puntuacion: {puntuacion} | MinasRestantes: {minas}")
    print(f"¡Has encontrado todas las minas! Tu puntuacion final es: {puntuacion}")

#Ejecuta terminar
def ejecutaTerminar():
    print("Saliendo del programa")

leeValidaOpcion()
