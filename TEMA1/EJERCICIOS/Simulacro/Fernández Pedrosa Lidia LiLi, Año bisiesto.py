def es_bisiesto(año):
    if (año % 4 == 0 and año % 100 != 0) or (año % 400 == 0):
        return True
    else:
        return False

while True:
    año = int(input("Introduce un año (o un número negativo para salir): "))
    if año < 0:
        print("Fin del programa.")
        break
    elif es_bisiesto(año):
        print(f"El año {año} es bisiesto.")
    else:
        print(f"El año {año} no es bisiesto.")