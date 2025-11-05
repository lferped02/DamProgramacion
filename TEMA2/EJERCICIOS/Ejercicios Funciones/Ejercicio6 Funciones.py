from math import pi

def calculaArea (radio):
    area = radio^2*pi
    return area

def calculaperimetro (radio):
    perimetro = 2*pi*radio
    return perimetro

def calculaAreayperimetro (radio):
    area = calculaArea (radio)
    perimetro = calculaperimetro (radio)
    return [perimetro, area]

radio_entrada = int (input ("dame el radio de la circuferencia"))
resultado = calculaAreayperimetro (radio_entrada)

print (resultado [0])
print (resultado [1]) 