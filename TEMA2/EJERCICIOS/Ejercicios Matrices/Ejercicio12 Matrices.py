matriz=[[8, 1, 6],
        [3, 5, 7],
        [4, 9, 2]]

#Matriz posición
def matrizPosicion(n, m):
    matriz = []
    for i in range(n):
        fila = []
        for j in range(m):
            fila.append(i + j)
        matriz.append(fila)
    return matriz

#Programa principal
matriz = matrizPosicion(3, 4)
for fila in matriz:
    print(fila)