numero = input("Introduce un número: ")
numeroVoltea = ""

# Recorremos el número desde el último carácter hasta el primero
for i in range(len(numero) - 1, -1, -1):
    numeroVoltea += numero[i]

print(f"El número volteado es: {numeroVoltea}")
