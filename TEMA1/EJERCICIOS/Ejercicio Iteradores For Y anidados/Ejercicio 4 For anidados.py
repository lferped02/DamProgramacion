numero = int (input ("Introduce un número: "))

for i in range(numero):
    if i == 0 or i == numero - 1:
        print("*" * numero)
    else:
        print("*" + " " * (numero - 2) + "*")
