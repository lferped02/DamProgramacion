matriz=[[8, 1, 6],
        [3, 5, 7],
        [4, 9, 2]]

#Suma por filas igual
def sumaPorFilasIgual(matriz):
    iguales = True
    suma = sum(matriz[0])
    for fila in matriz:
        if sum(fila) != suma:
            iguales = False
    return iguales

#Suma por columnas igual
def sumaPorColumnasIguales(matriz):
    iguales = True
    n = len(matriz[0])
    suma = sum(matriz[i][0] for i in range(len(matriz)))
    for j in range(n):
        if sum(matriz[i][j] for i in range(len(matriz))) != suma:
            iguales = False
    return iguales

#Suma total igual
def sumaTotalIgual(matriz):
    return sumaPorFilasIgual(matriz) and sumaPorColumnasIguales(matriz)

#Programa principal
print(sumaPorFilasIgual(matriz))
print(sumaPorColumnasIguales(matriz))
print(sumaTotalIgual(matriz))