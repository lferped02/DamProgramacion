import random

aleatorio = random.randint (1, 10)
humano = int (input ("Dame un numero: "))
while humano !=aleatorio:
    humano = int (input ("Dame otro numero: "))
print ("Lo has adivinado", aleatorio)