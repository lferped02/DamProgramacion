matriz=[[8, 1, 6],
        [3, 5, 7],
        [4, 9, 2]]

def sumaFilasPares(matriz):
    suma = 0
    for i in range(len(matriz)):
        if i % 2 == 0:
            suma += sum(matriz[i])
    return suma

# Programa principal
print(sumaFilasPares(matriz))
