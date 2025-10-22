import random

numeros = []
cuadrados = []
cubos = []

# Llenar las listas
for i in range(20):
    n = random.randint(0, 100)
    numeros.append(n)
    cuadrados.append(n * n)
    cubos.append(n * n * n)

# Mostrar los resultados
print("Número  Cuadrado  Cubo")
for i in range(20):
    print(numeros[i], "   ", cuadrados[i], "   ", cubos[i])
