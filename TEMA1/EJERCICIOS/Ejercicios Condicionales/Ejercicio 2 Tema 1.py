edad = int (input("Introduce la edad: "))
ciudadano = (input("¿Eres ciudadano?"))
if ciudadano == "Si":
    ciudadano = True
else:
    ciudadano = False

if edad >=18 and ciudadano:
    print ("Puede votar en las elecciones")
else:
    print ("No puede votar en las elecciones")