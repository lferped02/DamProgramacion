def cargaElemento():
    listaElemento = []
    while True:
        numeros = input("Introduce el número (o cualquier letra para salir): ")
        if numeros.isdigit():   # comprueba si es número
            listaElemento.append(int(numeros))
        else:
            break
    return listaElemento

def estaOrdenadaAscendentemente(lista):
    orden = True
    i = 0
    while i < len(lista) - 1 and orden:
        if lista[i] > lista[i + 1]:
            orden = False
        i += 1
    return orden

def estaOrdenadaDescendentemente(lista):
    orden = True
    i = 0
    while i < len(lista) - 1 and orden:
        if lista[i] < lista[i + 1]:
            orden = False
        i += 1
    return orden

def estaOrdenada(lista):
    if estaOrdenadaAscendentemente(lista):
        print("La lista está ordenada ascendentemente")
    elif estaOrdenadaDescendentemente(lista):
        print("La lista está ordenada descendentemente")
    else:
        print("La lista no está ordenada")

# Programa principal
lista1 = cargaElemento()
print("Lista introducida:", lista1)
estaOrdenada(lista1)
