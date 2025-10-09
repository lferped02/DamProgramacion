numero = int (input ("Introduce un numero: "))

for i in range(numero):
    if i % 2 == 0:
        print("*###*")
    else:
        print("*@*@*")
