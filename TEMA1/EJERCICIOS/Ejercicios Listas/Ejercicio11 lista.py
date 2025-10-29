import random

numeros = [random.randint(0, 100) for _ in range(20)]
print("Lista original:")
print(numeros)

pares = []
impares = []

for numero in numeros:
    if numero % 2 == 0:
        pares.append(numero)
    else:
        impares.append(numero)
resultado = pares + impares

print("\nLista con pares al principio e impares al final:")
print(resultado)
