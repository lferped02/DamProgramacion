matriz = [[0,2,4],
          [1,3,5],
          [6,8,10]]

print(matriz)
print(matriz[1])#Fila 1
print(matriz[1][1])#Elemento fila 1, columna 1

#Suma de la segunda fila
def suma(matriz, numeroFila):
    suma=0
    for i in matriz[numeroFila]:
        suma += i
        print(suma)
    return suma

def sumaTotal(matriz):
    suma = 0
    for fila in matriz:       # Recorre cada fila
        for elemento in fila: # Recorre cada elemento de la fila
            suma += elemento
    return suma

# Programa principal
print(suma(matriz,1))
print(sumaTotal(matriz))