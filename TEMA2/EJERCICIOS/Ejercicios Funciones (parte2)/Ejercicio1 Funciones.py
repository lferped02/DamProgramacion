# Obtener lista
def obtenerLista():
    lista = []
    numero = int(input("Introduce un numero: "))
    for i in range(0, numero):
        lista.append(i)
    return lista

# Pintar lista inversa sin usar reversed
def calculaListaInverso(lista):
    invertida = []
    # Recorremos la lista desde el último índice hasta el primero
    for i in range(len(lista) - 1, -1, -1):
        invertida.append(lista[i])
        print(lista[i])
    return invertida

# Programa principal
listaInicial = obtenerLista()
listaInvertida = calculaListaInverso(listaInicial)
print(f"Lista invertida:{listaInvertida}")
