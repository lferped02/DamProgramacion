def cargarLista():
    lista = []
    cadena = input("Introduce una cadena (Enter para terminar): ")
    while cadena != "":
        lista.append(cadena)
        cadena = input("Introduce otra cadena (Enter para terminar): ")
    return lista

def eliminarRepetidos(lista):
    listaSinRepetidos = []
    for elemento in lista:
        if elemento not in listaSinRepetidos:
            listaSinRepetidos.append(elemento)
    return listaSinRepetidos


lista = cargarLista()
print("Lista original:", lista)
listaFinal = eliminarRepetidos(lista)
print(f"Lista sin repetidos: {listaFinal}")

