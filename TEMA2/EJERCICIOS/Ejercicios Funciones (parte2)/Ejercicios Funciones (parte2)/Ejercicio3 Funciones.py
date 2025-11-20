numeros = []
for i in range(10):
    numero = int(input(f"Introduce el número {i+1}: "))
    numeros.append(numero)

# Filtramos los que terminan en 3
resultado = []
for n in numeros:
    if n % 10 == 3:
        resultado.append(n)

print(f"Los números que terminan en 3 son: {resultado}")
