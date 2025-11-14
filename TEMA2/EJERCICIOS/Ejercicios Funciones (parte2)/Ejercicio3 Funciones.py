#Obtener lista
def obtenerLista():
    lista = []
    numero = int(input("Introduce un numero: "))
    for i in range(0, numero):
        lista.append(i)
    return lista

#Devolver la lista
def devolverLista(lista):
    listaNueva = []
    for i in lista:
        if i %3==0:
            listaNueva.append(i)
    return listaNueva
