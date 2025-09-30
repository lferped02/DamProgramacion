Temperatura = float (input("Introduce temperatura ambiente: "))
if Temperatura > 26:
    print ("Está encendido el aire acondicionado.")
    Temperatura = float (input("Introduce nuevamente la temperatura ambiente: "))
    if Temperatura < 23:
        print ("Está apagado el aire acondicionado.")
elif Temperatura < 16:
    print ("Está encendido la calefacción.")
else:
    print ("No encender el aire.")
        
print ("Registro" + str(Temperatura))
 