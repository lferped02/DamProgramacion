numero = int (input ("Introduce un número: "))

for i in range(numero):
    for j in range(numero):
        if i == 0 or i == numero - 1 or j == 0 or j == numero - 1:
            print("*", end=" ")
        else:
            print(" ", end=" ")
    print()  