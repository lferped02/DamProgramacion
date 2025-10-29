numeros = []
print("Introduce 15 números:")
for i in range(15):
    numero = int(input(f"Número {i + 1}: "))
    numeros.append(numero)
ultimo = numeros[-1]

for i in range(14, 0, -1):
    numeros[i] = numeros[i - 1]
numeros[0] = ultimo

print("Lista rotada:")
print(numeros)
