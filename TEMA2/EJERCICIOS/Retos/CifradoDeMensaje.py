matriz=[["A","B","C","D"], # Fila 1
        ["E","F","G","H"], # Fila 2
        ["I","J","K","L"], # Fila 3
        ["M","N","Ñ","O"], # Fila 4
        ["P","Q","R","S"], # Fila 5
        ["T","U","V","W"], # Fila 6
        ["X","Y","Z","_"]] # Fila 7 ("_" representa el espacio)

# Apartado1
mensajeCifrado = "21,34,74,21,71,31,61,44,74,34,34,21,23,11,74,13,44,42,74,61,53,11,12,11,32" \
",44,74,72,74,51,21,53,54,31,54,61,21,42,13,31,11"
listaCadena = mensajeCifrado.split(",")
 # Calcular el descifrado
def descifrar(matriz, listaCadena):
    mensaje = ''
    for par in listaCadena:
        fila = int(par[0])-1
        columna = int(par[1])-1
        mensaje += matriz[fila][columna]
    return mensaje

# Apartado2
def buscaLetraMatriz(matriz, letra):
    posicion = (-1, -1)
    for fila in range(len(matriz)):
        for columna in range(len(matriz[fila])):
            if matriz[fila][columna] == letra:
                posicion = (fila, columna)
    return posicion

def buscaLetraFila(listaletra, letra):
    posicion = -1
    for i in range(len(listaletra)):
        if listaletra[i] == letra:
            posicion = i
    return posicion

# Programa principal
#print(descifrar(matriz, listaCadena))
print(buscaLetraFila(['A', 'B', 'C', 'D'], 'C'))
print(buscaLetraMatriz(matriz, "Z"))