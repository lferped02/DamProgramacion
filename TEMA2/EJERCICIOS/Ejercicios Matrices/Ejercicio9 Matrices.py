matriz=[[8, 1, 6],
        [3, 5, 7],
        [4, 9, 2]]

#El diagonal principal (Empieza en 0,0)
def devuelveDiagonalPrincipal(matriz):
    diagonal=[]
    for i in range(len(matriz)):
        diagonal.append(matriz[i][i])
    return diagonal

#El diagonal secundaria (Empieza en 0, numeroFila-1)
def devuelveNumeroDiagonalSecundaria(matriz):
    diagonal=[]
    n=len(matriz)
    for i in range(n):
        diagonal.append(matriz[i][n-1-i])
    return diagonal

#Programa principal
print(devuelveDiagonalPrincipal(matriz))
print(devuelveNumeroDiagonalSecundaria(matriz))