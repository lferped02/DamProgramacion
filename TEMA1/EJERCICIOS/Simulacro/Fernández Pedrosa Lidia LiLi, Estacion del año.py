dia = int (input ("Introduce un día: "))
mes = int (input ("Introduce un mes: "))

if dia > 31 and mes > 12:
    print("Fin del programa.")
    exit()

hemisferio = input("Introduce el hemisferio (Norte/Sur): ")
while hemisferio != "Norte" and hemisferio != "Sur":
    hemisferio = input("Hemisferio incorrecto. Escribe Norte o Sur: ")

if hemisferio == "Norte":
    if (mes == 12 and dia >= 21) or (mes == 1) or (mes == 2) or (mes == 3 and dia < 21):
        estacion = "Invierno"
    elif (mes == 3 and dia >= 21) or (mes == 4) or (mes == 5) or (mes == 6 and dia < 21):
        estacion = "Primavera"
    elif (mes == 6 and dia >= 21) or (mes == 7) or (mes == 8) or (mes == 9 and dia < 23):
        estacion = "Verano"
    else:
        estacion = "Otoño"
else:  
    if (mes == 6 and dia >= 21) or (mes == 7) or (mes == 8) or (mes == 9 and dia < 23):
        estacion = "Invierno"
    elif (mes == 9 and dia >= 23) or (mes == 10) or (mes == 11) or (mes == 12 and dia < 21):
        estacion = "Primavera"
    elif (mes == 12 and dia >= 21) or (mes == 1) or (mes == 2) or (mes == 3 and dia < 21):
        estacion = "Verano"
    else:
        estacion = "Otoño"

print("Estás en:", estacion)
print()
