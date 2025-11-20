#Esta ordenada 
def estaOrdenada(lista, ascendente=True):
    i = 0
    ordenada=True
    while i < len(lista) - 1 and ordenada:
        if ascendente:  # comprobar ascendente
            if lista[i] > lista[i + 1]:
                ordenada=False
        else:  # comprobar descendente
            if lista[i] < lista[i + 1]:
                ordenada=False
        i += 1
    return ordenada

#Esta ordenado
print(estaOrdenada([1, 2, 3, 4, 5], False))
print(estaOrdenada([5, 4, 3, 2, 1], False))
print(estaOrdenada([3, 5, 2, 8], False))
print(estaOrdenada([10, 20, 15], False))

print(estaOrdenada([1, 2, 3, 4, 5]))
print(estaOrdenada([5, 4, 3, 2, 1]))
print(estaOrdenada([3, 5, 2, 8]))
print(estaOrdenada([10, 20, 15]))