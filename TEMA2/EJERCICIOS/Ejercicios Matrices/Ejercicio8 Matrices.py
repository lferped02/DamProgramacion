matriz=[[8, 1, 6],
        [3, 5, 7],
        [4, 9, 2]]

# Máximo de una fila
def maximoFila(matriz, fila):
    return max(matriz[fila])

# Máximo de una columna (recorriendo cada fila)
def maximoColumna(matriz, columna):
    mayor=matriz[0][columna]
    for fila in matriz:
        if fila[columna] > mayor:
            mayor=fila[columna]
    return mayor

# Máximo total (recorriendo todo con dos bucles)
def maximoTotal(matriz):
    mayor=matriz[0][0]
    for fila in matriz:
        for numero in fila:
            if numero>mayor:
                mayor=numero
    return mayor

# Programa principal
print(maximoFila(matriz, 1))
print(maximoColumna(matriz, 2))
print(maximoTotal(matriz))
