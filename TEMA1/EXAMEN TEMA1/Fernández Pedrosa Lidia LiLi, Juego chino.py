import random

humano = int (input ("Piensa un numero de piedra que esconde en la mano (0-5): "))
maquina = random.randint (0, 5)

match humano:
    case 0: 
        match maquina:
            case 0|2|4:
                print ("Es par")
            case 1|3|5: 
                print ("Es impar")
    case 1: 
        match maquina:
            case 0|2|4:
                print ("Es par")
            case 1|3|5: 
                print ("Es impar")
    case 2: 
        match maquina:
            case 0|2|4:
                print ("Es par")
            case 1|3|5: 
                print ("Es impar")
    case 3: 
        match maquina:
            case 0|2|4:
                print ("Es par")
            case 1|3|5: 
                print ("Es impar")
    case 4: 
        match maquina:
            case 0|2|4:
                print ("Es par")
            case 1|3|5: 
                print ("Es impar")
    case 5: 
        match maquina:
            case 0|2|4:
                print ("Es par")
            case 1|3|5: 
                print ("Es impar")
        
    case _:
        print ("Se acabo la partida")

sumaTotal = int (input("Dame la suma total"))
suma =+ sumaTotal
print("FIN")