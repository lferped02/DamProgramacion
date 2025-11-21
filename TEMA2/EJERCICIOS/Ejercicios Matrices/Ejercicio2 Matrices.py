matriz=[[8, 1, 6],
        [3, 5, 7],
        [4, 9, 2]]

def sumaMatriz(matriz):
    suma=0
    for fila in matriz:
        for elemento in fila:
            suma+=elemento
    return suma

# Programa principal
print(sumaMatriz(matriz))