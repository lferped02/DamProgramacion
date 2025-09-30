estacionDeAño = input("Dame un numero de mes (1-12):")
match estacionDeAño:
    case 1 | 2 | 3:
        print ("Invierno")
    case 4 | 5 | 6:
        print ("Primavera")
    case 7 | 8 | 9:
        print ("Verano")
    case 10 | 11 | 12:
        print ("Otoño")
    case _:
        print("No valido")