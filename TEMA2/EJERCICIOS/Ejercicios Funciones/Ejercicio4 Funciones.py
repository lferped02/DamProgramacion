def calcularMaximo(lista):
    maxima = lista[0]  # Usamos el primer valor como referencia inicial
    for numero in lista:
        if numero > maxima:
            maxima = numero
    return maxima

# Entrada de datos
lista = []
while len(lista) < 10:
    try:
        numero = int(input(f"Introduce el número {len(lista)+1}: "))
        lista.append(numero)
    except ValueError:
        print("Por favor, introduce un número válido.")

# Salida
print("El número máximo es:", calcularMaximo(lista))
