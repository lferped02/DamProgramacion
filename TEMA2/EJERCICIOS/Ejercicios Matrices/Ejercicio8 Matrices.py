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

# Calcula la lista de máximos por fila
def calculaListaMaximo(matriz):
    listaMaximos = []
    for fila in matriz:
        listaMaximos.append(calculaMaximo(fila))
    return listaMaximos

# Obtiene el máximo de una fila concreta
def getMaximoPorFila(numeroFila, matriz):
    listaMaximo = calculaListaMaximo(matriz)
    return listaMaximo[numeroFila]

# Calcula el máximo de una columna
def maximoColumna(matriz, columna):
    maximo = matriz[0][columna]
    for fila in matriz:
        if fila[columna] > maximo:
            maximo = fila[columna]
    return maximo

# Calcula el máximo total de las sumas de filas
def totalMatriz(matriz):
    lista = []
    for fila in matriz:
        suma = sum(fila)
        lista.append(suma)
    return max(lista)

# Programa principal
print("Máximos por fila:", calculaListaMaximo(matriz))
print("Máximo de la primera fila:", calculaMaximo(matriz[0]))
print("Máximo de la columna 1:", maximoColumna(matriz, 1))
print("Máximo total de sumas de filas:", totalMatriz(matriz))
