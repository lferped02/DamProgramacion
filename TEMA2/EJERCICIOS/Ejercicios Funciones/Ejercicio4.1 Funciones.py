def calcularMinimo(numeroLista):
    minimo = numeroLista[0]
    for i in range(len(numeroLista)-1, -1, -1):
        if numeroLista[i] < minimo:
            minimo = numeroLista[i]
    return minimo

lista = []
while len(lista) < 10:
    try:
        numero = int(input(f"Introduce el número {len(lista)+1}: "))
        lista.append(numero)
    except ValueError:
        print("Por favor, introduce un número válido.")

print("El número mínimo es:", calcularMinimo(lista))
