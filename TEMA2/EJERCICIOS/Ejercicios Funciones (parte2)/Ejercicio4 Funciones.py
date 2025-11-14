#Esta ordenada ascendentemente
def estaOrdenadaAscendemente(lista):
    i=0
    ordenada = True
    while i<len(lista)-1 and ordenada:
        if lista[i]>lista[i+1]:
            ordenada = False
        i+=1
    return ordenada

# Programa principal
orden = estaOrdenadaAscendemente([1, 2, 3, 4])
print(orden)   
orden = estaOrdenadaAscendemente([1, 3, 2, 4])
print(orden)   
