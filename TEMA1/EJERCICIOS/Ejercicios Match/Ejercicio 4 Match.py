mes = int(input("Introduce el número del mes (1-12): "))
dia = int(input("Introduce el número del día (1-31): "))

match dia:
    case 3:
        if dia <= 20:
            print("Es invierno")
        else:
            print("Es primavera")
    case 6:
        if dia <= 20:
            print("Es primavera")
        else:
            print("Es verano")
    case 9:
        if dia <= 20:
            print("Es verano")
        else:
            print("Es otoño")
    case 12:
        if dia <= 20:
            print("Es otoño")
        else:
            print("Es invierno")
if mes in [1, 2]:
    print("Es invierno")
elif mes in [4, 5]:
    print("Es primavera")
elif mes in [7, 8]:
    print("Es verano")
elif mes in [10, 11]:
    print("Es otoño")
else:
    print("Mes inválido")