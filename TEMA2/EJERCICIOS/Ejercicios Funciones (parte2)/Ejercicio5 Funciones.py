#Esta ordenada 
def estaOrdenada(lista, ascendente=True):
    i = 0
    while i < len(lista) - 1:
        if ascendente:  # comprobar ascendente
            if lista[i] > lista[i + 1]:
                return False
        else:  # comprobar descendente
            if lista[i] < lista[i + 1]:
                return False
        i += 1
    return True

#Esta ordenado
print(estaOrdenada([1, 2, 3, 4, 5], True))
print(estaOrdenada([5, 4, 3, 2, 1], False))
print(estaOrdenada([3, 5, 2, 8], True))
print(estaOrdenada([10, 20, 15], False))