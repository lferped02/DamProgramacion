#Definición función compruebaSiPar recibe el numero y devuelve un booleano (True o False)
def compruebaSiPar(numero):
    return numero %2==0

numero = int(input("Introduce un numero: "))
esPar = compruebaSiPar(numero)
print(numero, esPar)
esPar = compruebaSiPar(numero)
print(f"32 {esPar}")
#Comprueba si es multiplo de 3
def compruebaMultiplo3(numero):
    return numero %3==0
#Comprueba si es multiplo de 7
def comrpuebaMultiplo7(numero):
    return numero %7==0