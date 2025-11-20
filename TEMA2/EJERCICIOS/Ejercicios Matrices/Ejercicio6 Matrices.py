def sumaColumna(matriz, indiceColumna):
    suma = 0
    for fila in matriz:
        suma += fila[indiceColumna]
    return suma

matriz=[[1, 2, 3], 
        [4, 5, 6]]
print(sumaColumna(matriz, 1))
