dia = input ("Dame un dia: ").upper()
match dia:
    case "MARTES":
        print ("=========================")
        print ("==========MARTES=========")
        print ("=========================")
        print ("8-9-> PROG")
        print ("9-10-> PROG")
        print ("10-11-> LM")
        print ("11-11.30-> RECREO")
        print ("11.30-13.30-> LM")
        print ("13.30-14.30 -> FOL")
        print ("=========================")
    case "Sabado"|"Domingo":
        print ("Día de estudio y reflexión")
    case _:
        print ("No es valido")