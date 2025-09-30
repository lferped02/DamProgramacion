dia = input ("Dame un dia: ")
match dia:
    case "LUNES"|"Lunes"|"lunes":
        print ("-------------------------")
        print ("----------LUNES----------")
        print ("-------------------------")
        print ("8-9-> FOL")
        print ("9-10-> EDE")
        print ("10-11-> PROG")
        print ("11-11.30-> RECREO")
        print ("11.30-12.30-> PROG")
        print ("12.30- 14.30 -> BBDD")
    
    case "Sabado"|"Domingo":
        print ("Día de estudio y reflexión")
    case _:
        print ("No es valido")