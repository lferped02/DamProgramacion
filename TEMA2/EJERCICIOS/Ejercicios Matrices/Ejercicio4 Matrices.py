matriz=[[8, 1, 6],
        [3, 5, 7],
        [4, 9, 2]]

def sumaFila(matriz, numeroFila):
    suma=0
    for elemento in matriz[numeroFila]:
        suma+=elemento
    return suma

# Programa principal
print(sumaFila(matriz, 1))