numero = int (input ("Dame un numero: "))
resultado = 1
for i in range (numero-1, 0, -1):
    print (i,"*",resultado)
    resultado = resultado * i
    print (resultado)
print ("FIN")