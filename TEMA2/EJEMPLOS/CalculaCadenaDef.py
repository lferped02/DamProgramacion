def calculaCadena(posicion1, posicion2, numero):
    salida1 = numero[posicion1]+numero[posicion2]
    print(salida)
    return salida1, "Hola"

#Lee y validar datos
cadena = input ("Introduce una cadena que debe tener mas de 4 caracteres:")
numero = int (cadena)
salida = ""

while len(cadena)<=4:
    cadena = input("Introduce una cadena que debe tener mas de 4 caracteres:")

#Comprueba si es par
if numero%2==0:
    #salida = cadena[2]+cadena[4]
    calculaCadena(2,4,cadena)
    output = calculaCadena(2,4,cadena)
    print(output)
#Comprueba si es multiplo de 3
elif numero %3==0:
    #salida = cadena[1]+cadena[2]
    calculaCadena(1,2,cadena)
#Comprueba si es multiplo de 7
elif numero%7==0:
    #salida = cadena[0]+cadena[3]
    calculaCadena(0,3,cadena)
