import random

numero = random.randint(0, 10)
numero2 = random.randint(0, 10)
sumaCorrecta = numero + numero2
while True:
    respuesta = int(input("¿Cuánto es {numero} + {numero2}? "))
    if respuesta == sumaCorrecta:
        print("¡Correcto!")
        break
    else:
        print("Incorrecto. Intenta de nuevo.")
