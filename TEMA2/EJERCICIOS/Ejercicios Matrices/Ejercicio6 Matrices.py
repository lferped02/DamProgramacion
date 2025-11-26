matriz=[[8, 1, 6],
        [3, 5, 7],
        [4, 9, 2]]
def sumaColumna(matriz, indiceColumna):
    suma = 0
    for fila in matriz:
        suma+=fila[indiceColumna]
    return suma

# Programa principal
resultado = sumaColumna(matriz, 0)#Suma la primera columna (índice 0)
print(f"La suma de la columna es: {resultado}")
