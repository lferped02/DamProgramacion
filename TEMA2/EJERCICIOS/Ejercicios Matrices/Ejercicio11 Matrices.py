matriz=[[8, 1, 6],
        [3, 5, 7],
        [4, 9, 2]]

#Suma diagonal
def sumaDiagonal(matriz,esPrincipal):
    suma=0
    if len(matriz)==len(matriz[0]):
        n=len(matriz)
        if esPrincipal:
            for i in range(n):
                suma+=matriz[i][i]
        else:
            for i in range(n):
                suma+=matriz[i][n-1-i]
    return suma

#Programa principal
print(sumaDiagonal(matriz, True))
print(sumaDiagonal(matriz, False))