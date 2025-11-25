matriz=[[8, 1, 6],
        [3, 5, 7],
        [4, 9, 2]]

#Diagonal principal con comprobacion
def devuelveDiagonalPrincipal(matriz):
    diagonal=[]
    if len(matriz)==len(matriz[0]):
        for i in range(len(matriz)):
            diagonal.append(matriz[i][i])
    return diagonal

#Diagonal segundaria con comprobación
def devuelveDiagonalSecundaria(matriz):
    diagonal=[]
    if len(matriz)==len(matriz[0]):
        n=len(matriz)
        for i in range(n):
            diagonal.append(matriz[i][n-1-i])
    return diagonal

#Programa principal
print(devuelveDiagonalPrincipal(matriz))
print(devuelveDiagonalSecundaria(matriz))