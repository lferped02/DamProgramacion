matriz=[[8, 1, 6],
        [3, 5, 7],
        [4, 9, 2]]
def numeroPares(matriz):
    pares=[]
    for fila in matriz:
        for elemento in fila:
            if elemento %2==0:
                pares.append(elemento)
    return pares

# Programa principal
print(numeroPares(matriz))