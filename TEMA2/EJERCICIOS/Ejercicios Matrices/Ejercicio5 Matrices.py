def sumaFilasPares(matriz):
    suma = 0
    for i in range(len(matriz)):
        if i % 2 == 0:
            suma += sum(matriz[i])
    return suma

matriz = [[1, 2, 3], 
          [4, 5, 6], 
          [7, 8, 9]]
print(sumaFilasPares(matriz))
