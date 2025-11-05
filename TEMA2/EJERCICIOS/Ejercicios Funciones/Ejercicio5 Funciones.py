def calcularMaximo(lista):
    maximo = lista[0]
    for numero in lista:
        if numero > maximo:
            maximo = numero
    return maximo

def calcularMinimo(lista):
    minimo = lista[0]
    for numero in lista:
        if numero < minimo:
            minimo = numero
    return minimo

def calcularMaximoMinimo(lista):
    maximo = calcularMaximo(lista)
    minimo = calcularMinimo(lista)
    return maximo, minimo

# Entrada de datos
numeros = []
while len(numeros) < 10:
    numero = int(input(f"Introduce el número {len(numeros)+1}: "))
    numeros.append(numero)

# Cálculo y salida
maximo, minimo = calcularMaximoMinimo(numeros)
print(f"El número máximo es: {maximo}")
print(f"El número mínimo es: {minimo}")
