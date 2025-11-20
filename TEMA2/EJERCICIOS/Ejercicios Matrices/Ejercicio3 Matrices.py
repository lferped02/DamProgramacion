def numeroPares(matriz):
    pares=[]
    for fila in matriz:
        for elemento in fila:
            if elemento %2==0:
                pares.append(elemento)
    return pares

matriz=[[1,2,3],
        [4,5,6]]
print(numeroPares(matriz))