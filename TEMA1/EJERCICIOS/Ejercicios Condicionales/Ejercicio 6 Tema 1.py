cantidad = float (input ("Dame la cantidad que deseas retirar: "))
saldo = float (input ("Dame la cantidad de saldo de la cuenta:"))
if cantidad < saldo:
    print ("Puedes retirar el dinero")
else:
    print ("No hay saldo suficiente")
print ("FIN")