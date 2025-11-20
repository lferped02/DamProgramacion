def sumaFila(matriz, indiceFila):
    suma=0
    for elemento in matriz[indiceFila]:
        suma+=elemento
    return suma

matriz=[[1, 2, 3], 
        [4, 5, 6]]
print(sumaFila(matriz, 1))