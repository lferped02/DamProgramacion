#La lista son objetos mutables
def suma(numero1, numero2):
    numero1.insert(0, numero2)
    return numero1

numero1 = [2, 3, 4]
numero2= 3
print(suma(numero1,numero2))
print(numero1)