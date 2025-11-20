def sumaMatriz(matriz):
    suma=0
    for fila in matriz:
        for elemento in fila:
            suma+=elemento
    return suma

matriz=[[1,2,3],
        [4,5,6]]
print(sumaMatriz(matriz))