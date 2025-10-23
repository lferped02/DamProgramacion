numero = []

# Pedir 10 números por teclado
for i in range(10):
    numeros = int(input("Introduce el número: "))
    numero.append(numeros)

# Encontrar el maximo y el minimo
maximo = numero [0]
minimo = numero [0]

for numeros in numero:
    if numeros>maximo:
        maximo = numeros
    elif numeros<minimo:
        minimo = numeros
print ("Numeros introducidos: ")

for numeros in numero:
    if numeros == maximo:
        print (numeros, "-> máximo")
    elif numeros == minimo:
        print(numeros, "→ mínimo")
    else:
        print(numeros)