matriz=[[8, 1, 6],
        [3, 5, 7],
        [4, 9, 2]]

#Sumar las columnas pares
def sumaColumnasPares(matriz):
    suma = 0
    for fila in matriz:
        for columna in range(len(fila)):
            if columna % 2 == 0:   # columna par
                suma += fila[columna]
    return suma

# Programa principal
print(sumaColumnasPares(matriz))
