grupoSanguineo= "Saguineo"

while grupoSanguineo == "Saguineo":
    donante = input ("Grupo del donante (A, B, AB, 0)".upper())
    receptor = input ("Grupo del receptor (A, B, AB, 0)".upper())

    grupoValidos = ["A", "B", "AB", "0"]
    valido = True

    for grupo in [donante, receptor]:
        if grupo not in grupoValidos:
            print (f"Grupo invalido: {grupo}")
            valido = False 
    
    if valido:
        if donante == "0":
            compatibles = ["0", "A", "B", "AB"]
        elif donante == "A":
            compatibles = ["A", "AB"]
        elif donante == "B":
            compatibles = ["B", "AB"]
        elif donante == "AB":
            compatibles = ["AB"]
        else:
            compatibles = []
        
        if receptor in compatibles:
            match receptor:
                case "AB":
                    print (f"{receptor} puede recibir de {donante} (receptor universal)")
                case _:
                    print (f"{receptor}no puede recibir de {donante}")
            
