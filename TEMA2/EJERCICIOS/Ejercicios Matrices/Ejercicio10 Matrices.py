matriz=[[8, 1, 6],
        [3, 5, 7],
        [4, 9, 2]]

def diagonalSiCuadrada(matriz):
    if len(matriz) != len(matriz[0]):
        return False, []
    
    diagonal = []
    for i in range(len(matriz)):
        diagonal.append(matriz[i][i])
    return True, diagonal

#Programa principal
print(diagonalSiCuadrada(matriz))
print(diagonalSiCuadrada(matriz))  