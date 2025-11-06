from math import pi

def calculaArea(radio):
    area = radio**2 * pi
    return area

def calculaperimetro(radio):
    perimetro = 2 * pi * radio
    return perimetro

def calculaAreayperimetro(radio):
    area = calculaArea(radio)
    perimetro = calculaperimetro(radio)
    return [perimetro, area]

radioEntrada = int(input("Introduce el radio de la circunferencia: "))
resultado = calculaAreayperimetro(radioEntrada)

print("Perímetro:", resultado[0])
print("Área:", resultado[1])
