numero = int(input("Introduce un número: "))
anadirNumero = int(input("Dime el número que quieres añadir: "))
numeroVeces = int(input("¿Cuántas veces quieres repetir el número añadido?"))

numeroTotal = numero + anadirNumero
print("Primer resultado:", numeroTotal)

for i in range(numeroVeces):
    numero += anadirNumero

print("Resultado final tras repetir:", numero)
