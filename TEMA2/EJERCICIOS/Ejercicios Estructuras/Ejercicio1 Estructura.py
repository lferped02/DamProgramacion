def pedirNumeros():
    numero1, numero2=0, 0
    correcto = False
    while not correcto:
        numero1=int(input("Introduce el primer numero: "))
        numero2=int(input("Introduce el segundo numero: "))
        if numero2<len(str(numero1)):
            correcto = True
        else:
            print("El segundo numero debe ser menor que el numero de cifras del primero")
    return numero1, numero2

def sumaDigitos(numero1, numero2):
    numeroStr=str(numero1)
    suma=0
    for i in range(numero2):
        suma+=int(numeroStr[i])
    return suma

#Programa principal
numero1, numero2 = pedirNumeros()
print(f"La suma es: {sumaDigitos(numero1, numero2)}")