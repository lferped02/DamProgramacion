matriz = [[8, 1, 6],
        [3, 5, 7],
        [4, 9, 2]]

def dameElemento(matriz, fila, columna):
    return matriz[fila][columna]

def dameFila(matriz, fila):
    return matriz[fila]

def dameColumna(matriz, columna):
    return [fila[columna] for fila in matriz]

# Ejemplos de uso
print(f"Elemento: {dameElemento(matriz, 1, 2)}")
print(f"Fila 0: {dameFila(matriz, 0)}")
print(f"Columna 1: {dameColumna(matriz, 1)}")
