import random
piedra = 0
papel = 1
tijera = 2

humano = int (input ("Piedra->0, Papel->1, Tijera->2:" ))
maquina = random.randint(0,2)

match humano:
    case 0: 
        match maquina:
            case 0:
                print ("Han empatado")
            case 1:
                print ("Gano la maquina")
            case 2: 
                print ("Gana el humano")
    case 1: 
        match maquina:
            case 0:
                print ("Gana el humano")
            case 1:
                print ("Han empatado")
            case 2: 
                print ("Gano la maquina")
    case 2:
        match maquina:
            case 0:
                print ("Gano la maquina")
            case 1:
                print ("Gana el humano")
            case 2: 
                print ("Han empatado")
    case _:
        print("Se acabo la partida")