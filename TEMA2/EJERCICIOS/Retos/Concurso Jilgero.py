# Genera la lista de notas
def generaLista():
    lista = []
    numero = int(input("Introduce una nota (1-5, 0 para terminar): "))
    while numero > 0:
        if 1 <= numero <= 5:   # Validamos que esté en el rango correcto
            lista.append(numero)
        else:
            print("Nota inválida, debe estar entre 1 y 5")
        numero = int(input("Introduce una nota (1-5, 0 para terminar): "))
    return lista

# Comprueba si la secuencia es válida (continua sin saltos)
def esValida(lista):
    if not lista:   # Evita error si la lista está vacía
        return False
    minimo = min(lista)
    maximo = max(lista)
    for i in range(minimo, maximo + 1):
        if i not in lista:
            return False
    return True

# Calcula los puntos (número de notas introducidas)
def calculaPuntos(lista):
    return len(lista)

# Programa principal
notas = generaLista()
if esValida(notas):
    print("Secuencia válida")
    print(f"Puntos: {calculaPuntos(notas)}")
else:
    print("Secuencia no válida")
