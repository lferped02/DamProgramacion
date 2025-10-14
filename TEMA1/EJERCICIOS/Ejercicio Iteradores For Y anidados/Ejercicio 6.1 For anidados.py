numero = int (input ("Introduce un numero: "))

for i in range(numero):
    
    if i %2 == 0:
        print ("*"+"#"*(numero-2)+"*")
    else:
        cadena = ""
        for j in range (numero):
            if j %2==0:
                cadena +="*"
            else:
                cadena +="@"
        print (cadena)