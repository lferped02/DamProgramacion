matriz=[[8, 1, 6],
        [3, 5, 7],
        [4, 9, 2]]

#El maximo de una fila 
def maximoFila(matriz, fila):
    return max(matriz[fila])

#El maximo de una columna 
def maximoColumna(matriz, columna):
    return max(f[columna] for f in matriz)

#El maximo total de la matriz
def maximoTotal(matriz):
    return max(max(f) for f in matriz)

#Programa principal
print(maximoFila(matriz, 1))
print(maximoColumna(matriz, 2))
print(maximoTotal(matriz))
