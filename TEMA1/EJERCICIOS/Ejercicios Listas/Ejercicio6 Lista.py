numero = []

# Pedir 10 números por teclado
for i in range(10):
    numeros = int(input("Introduce el número: "))
    numero.append(numeros)

# Encontrar el maximo y el minimo
maximo = max(numero)
minimo = min(numero)

# Mostrar los números con etiquetas
print ("Numeros introducidos: ")
for numeros in numero:
    if numeros == maximo:
        print (numeros, "-> máximo")
    elif numeros == minimo:
        print(numeros, "→ mínimo")
    else:
        print(numeros)