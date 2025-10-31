numero = input ("Introduce un numero: ")
numeroDelante = int (input ("Cuantos numeros quieres quitar?"))

if numeroDelante < len (numero):
    num1 = numero [numeroDelante : len (numero)]
    print (num1)

elif numero == len (numero):
    print ("La cadena esta no llena")

else: 
    print ("No se puede quitar mas digitos de los que contiene")