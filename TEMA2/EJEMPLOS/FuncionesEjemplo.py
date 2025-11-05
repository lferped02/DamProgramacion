#Lee y validar datos
cadena = input ("Introduce una cadena que debe tener mas de 4 caracteres:")
numero = input ("Dame un numero: ")
longitud = len (cadena) 

continuar = True 
while continuar:
    if len(cadena) <= 4:
        cadena = input ("Introduce una cadena que debe tener mas de 4 caracteres: ")
    else:
        continuar = False
#Comprueba si es par
if numero%2==0:
    print ((cadena [2] + cadena [4])* longitud)
#Comprueba si es multiplo de 3
elif numero %3==0:
    print ((cadena [1] + cadena [2])* longitud)
#Comprueba si es multiplo de 7
elif numero%7==0:
    print ((cadena [0] + cadena [3])* longitud)