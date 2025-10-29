numeros = []
print("Introduce 15 números:")
for i in range(15):
    numero = int(input(f"Número {i + 1}: "))
    numeros.append(numero)
n = int(input("¿Cuántas veces quieres rotar la lista? (debe ser menor que 15): "))

if n >= len(numeros):
    print("Error: el número debe ser menor que 15.")
else:
    for _ in range(n):
        ultimo = numeros[-1]
        for i in range(len(numeros) - 1, 0, -1):
            numeros[i] = numeros[i - 1]
        numeros[0] = ultimo
    print("Lista rotada:")
    print(numeros)
