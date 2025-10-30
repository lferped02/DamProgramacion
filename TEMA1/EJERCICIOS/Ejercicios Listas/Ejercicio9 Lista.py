numeros = []
print("Introduce 15 números:")
for i in range(15):
    numero = int(input(f"Número {i + 1}: "))
    numeros.append(numero)

cantidad = int(input("Dime el número de veces a rotar: "))

# Rotar manualmente hacia la derecha 'cantidad' veces
for _ in range(cantidad):
    ultimo = numeros[-1]
    for i in range(14, 0, -1):
        numeros[i] = numeros[i - 1]
    numeros[0] = ultimo

print("Lista rotada:")
print(numeros)

# Mostrar los primeros 'cantidad' números que fueron movidos al frente
print(f"Últimos {cantidad} números que rotaron al frente:")
for i in range(cantidad):
    print(numeros[i])
