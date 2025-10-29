numero = input("Introduce un número: ")
pegaNumero = input("Añade un número por detrás: ")
numeroVeces = int(input("¿Cuántas veces quieres repetir el número añadido?"))

for i in range(numeroVeces):
    numero += pegaNumero

print("Resultado final:", numero)
