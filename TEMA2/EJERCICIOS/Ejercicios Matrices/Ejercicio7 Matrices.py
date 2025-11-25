def sumaColumnasPares(matriz):
    suma = 0
    for fila in matriz:
        for columna in range(len(fila)):
            if columna % 2 == 0:   # columna par
                suma += fila[columna]
    return suma

# Programa principal
matriz=[[8, 1, 6],
        [3, 5, 7],
        [4, 9, 2]]

print(sumaColumnasPares(matriz))
