import random

numeros = []
cuadrados = []
cubos = []

# Llenar las listas
for i in range(20):
    numero = random.randint(0, 100)
    numeros.append(numero)
    cuadrados.append(numero * numero)
    cubos.append(numero * numero * numero)
print ("Numero", numeros[i])
print ("Cuadrado", cuadrados[i])
print ("Cubo", cubos[i])  

#for i in range(20):
    #print(numeros[i], " ", cuadrados[i], " ", cubos[i])
