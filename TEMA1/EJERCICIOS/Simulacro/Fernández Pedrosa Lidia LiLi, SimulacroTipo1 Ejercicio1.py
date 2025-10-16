numero = int (input ("Introduce el primer numero: "))
numero2 = int (input ("introduce el segundo numero: "))
numero3 = int (input ("Introduce el tercer numero"))

while numero !=0 or numero2 !=0 or numero3 !=0:
    if numero < numero2 < numero3:
        print ("El orden de los numeros es creciente")
    elif numero > numero2 and numero2 > numero3:
        print ("El orden de los numeros es descreciente")
    else:
        print("Los numeros estan desordenado")
