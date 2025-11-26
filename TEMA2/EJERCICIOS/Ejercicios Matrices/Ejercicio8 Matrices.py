matriz=[[8, 1, 6],
        [3, 5, 7],
        [4, 9, 2]]

# Calcula el máximo de una lista
def calculaMaximo(listaNumero):
    mayor = listaNumero[0]
    for numero in listaNumero:
        if numero > mayor:
            mayor = numero
    return mayor

# Devuelve la lista de máximos por fila
def getListaMaximosPorFila(matriz):
    listaMaximos = []
    for fila in matriz:
        listaMaximos.append(calculaMaximo(fila))
    return listaMaximos

# Devuelve el máximo de una fila concreta
def getMaximoPorFila(numeroFila, matriz):
    return calculaMaximo(matriz[numeroFila])

# Devuelve el máximo de una columna concreta
def getMaximoPorColumna(matriz, columna):
    maximo = matriz[0][columna]
    for fila in matriz:
        if fila[columna] > maximo:
            maximo = fila[columna]
    return maximo

# Devuelve el máximo total de las sumas de filas
def getMaximoTotal(matriz):
    listaSumas = []
    for fila in matriz:
        listaSumas.append(sum(fila))
    return max(listaSumas)

# Programa principal
print(f"Máximos por fila: {getListaMaximosPorFila(matriz)}")
print(f"Máximo de la primera fila: {getMaximoPorFila(0, matriz)}")
print(f"Máximo de la columna 1: {getMaximoPorColumna(matriz, 1)}")
print(f"Máximo total de sumas de filas: {getMaximoTotal(matriz)}")