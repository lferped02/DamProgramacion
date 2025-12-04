# MATRIZ UNICA (solo esto fuera de funciones)
puntuaciones = [
    [],  # inicial
    [],  # semifinal
    []   # final
    ]

# =============================
# Convierte fase → índice
# =============================
def faseIndice(fase):
    terminar = False
    indice = -1
    if fase == "inicial":
        indice = 0
        terminar = True
    if fase == "semifinal":
        indice = 1
        terminar = True
    if fase == "final":
        indice = 2
        terminar = True
    return indice

# =============================
# Pedir fase válida
# =============================
def pedirFase():
    fase = ""
    terminar = False
    while terminar == False:
        fase = input("Introduce fase (inicial / semifinal / final): ").lower()
        if fase == "inicial" or fase == "semifinal" or fase == "final":
            terminar = True
    return fase

# =============================
# Comprobar si es número
# =============================
def esNumero(texto):
    numeros = "0123456789"
    es = True
    i = 0
    while i < len(texto):
        if texto[i] not in numeros:
            es = False
        i = i + 1
    return es

# =============================
# REGISTRAR PUNTUACIONES
# =============================
def registrarPuntuaciones(puntuaciones):
    fase = pedirFase()
    indice = faseIndice(fase)
    if indice == 0:
        total = 8
    elif indice == 1:
        total = 4
    else:
        total = 2
    puntuaciones[indice] = []   # vaciar fase
    i = 0
    while i < total:
        entrada = input("Equipo " + str(i+1) + " (formato nombre:puntos): ")
        if ":" in entrada:
            parte = entrada.split(":")
            nombre = parte[0]
            puntos = parte[1]
            if esNumero(puntos):
                puntos = int(puntos)
                puntuaciones[indice].append([nombre, puntos])
                i = i + 1
            else:
                print("La puntuación debe ser numérica.")
        else:
            print("Formato incorrecto.")
    print("===================================")
    print("Datos registrados correctamente")
    print("===================================")
    return 0

# =============================
# LISTAR PUNTUACIONES
# =============================
def listarPuntuaciones(puntuaciones):
    fase = pedirFase()
    indice = faseIndice(fase)
    terminar = False
    if len(puntuaciones[indice]) == 0:
        print("===================================")
        print("La fase", fase.upper(), "no está registrada")
        print("===================================")
        terminar = True
    if terminar == False:
        print("===================================")
        print("Fase", fase)
        print("===================================")
        i = 0
        while i < len(puntuaciones[indice]):
            equipo = puntuaciones[indice][i][0]
            puntos = puntuaciones[indice][i][1]
            print(f"El equipo {equipo} ha obtenido {puntos} puntos")
            i = i + 1
    return 0

# =============================
# CALCULAR CLASIFICADOS
# =============================
def verClasificados(puntuaciones):
    fase = pedirFase()
    indice = faseIndice(fase)
    terminar = False
    if len(puntuaciones[indice]) == 0:
        print("===================================")
        print(f"La fase {fase.upper()} no está registrada en el sistema")
        print("===================================")
        terminar = True
    if terminar == False:
        if indice == 0:
            pasan = 4
        elif indice == 1:
            pasan = 2
        else:
            pasan = len(puntuaciones[indice])
        # Copiar para ordenar
        lista = []
        i = 0
        while i < len(puntuaciones[indice]):
            lista.append([puntuaciones[indice][i][0], puntuaciones[indice][i][1]])
            i = i + 1
        n = len(lista)
        cambiado = True
        while cambiado == True:
            cambiado = False
            i = 0
            while i < n - 1:
                if lista[i][1] < lista[i+1][1]:
                    aux = lista[i]
                    lista[i] = lista[i+1]
                    lista[i+1] = aux
                    cambiado = True
                i += 1
        print("===================================")
        print(f"Clasificados en fase semifinal {fase}")
        print("===================================")
        i = 0
        while i < pasan:
            print(lista[i][0], "con", lista[i][1], "puntos")
            i += 1
    return 0

def ejecutarPrograma(puntuaciones):
    salir = False
    opcion = ""
    # primer menú antes del bucle
    print("===== MENU ROCKET LEAGUE =====")
    print("R) Registrar puntuaciones")
    print("L) Listar puntuaciones por fase")
    print("C) Ver clasificados")
    print("S) Salir")
    print("===============================")
    opcion = input("Elige una opción: ").lower()

    while salir == False:
        if opcion == "r":
            registrarPuntuaciones(puntuaciones)
        elif opcion == "l":
            listarPuntuaciones(puntuaciones)
        elif opcion == "c":
            verClasificados(puntuaciones)
        elif opcion == "s":
            print("Saliendo del programa…")
            salir = True
        else:
            print("Opción incorrecta")
        if salir == False:
            print("===== MENU ROCKET LEAGUE =====")
            print("R) Registrar puntuaciones")
            print("L) Listar puntuaciones por fase")
            print("C) Ver clasificados")
            print("S) Salir")
            print("===============================")
            opcion = input("Elige una opción: ").lower()
    return 0

Ejecucion = ejecutarPrograma(puntuaciones)
print = Ejecucion