diaSemana = input ("Dame una opcion: ")
match diaSemana:
    case "L"|"M"|"X"|"J"|"V":
        print ("Tienes que ir al instituto")
  
    case "S"|"D":
        print ("Puedes estar en casa")
    case _:
        print ("No es valido")