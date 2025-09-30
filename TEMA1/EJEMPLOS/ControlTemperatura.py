Temperatura = float (input("Introduce temperatura ambiente: "))
if Temperatura > 26:
    print ("Está encendido el aire acondicionado.")
else:
    print ("No encender el aire.")
    if Temperatura < 10:
        print ("Está encendido la calefacción.")
    
print ("Registro" + str(Temperatura))
 