matriz=[[8, 1, 6],
        [3, 5, 7],
        [4, 9, 2]]

# Suma por filas
def sonIguales(listaNumeros):
    iguales  = True
    i = 0
    while i < (len(listaNumeros)-1) and iguales:
        if listaNumeros[i] != listaNumeros[i+1]:
            iguales = False
        else:
             i = i + 1
    return iguales

def sumaListaNumeros(listaNumeros):
    sumaFila = 0
    for n in listaNumeros:
        sumaFila = sumaFila + n
    return sumaFila

def sumaPorFilas(matriz):
    lista = []
    for fila in matriz:
        suma = sumaListaNumeros(fila)  
        lista.append(suma)
    return lista

resultado = sumaPorFilas(matriz)
print(resultado)   # [15, 15, 15]

def sumaPorFilasIgual(matriz):
    listaSuma = sumaPorFilas(matriz)
    iguales = sonIguales(listaSuma)   # corregido
    return iguales

# Suma por columnas igual
def sumaPorColumnasIguales(matriz):
    lista = []
    for j in range(len(matriz[0])):
        sumaColumna = 0
        for i in range(len(matriz)):
            sumaColumna += matriz[i][j]
        lista.append(sumaColumna)
    iguales = True
    k = 0
    while k < len(lista)-1 and iguales:
        if lista[k] != lista[k+1]:
            iguales = False
        else:
            k += 1
    return iguales


# Suma total igual (filas, columnas y diagonales)
def sumaTotalIgual(matriz):
    return (sumaPorFilasIgual(matriz) and 
            sumaPorColumnasIguales(matriz))

# Programa principal
print(f"Filas iguales: {sumaPorFilasIgual(matriz)}")
print(f"Columnas iguales: {sumaPorColumnasIguales(matriz)}")
print(f"Total igual: {sumaTotalIgual(matriz)}")
