grupoSanguineo= "Saguineo"

while grupoSanguineo == "Saguineo":
    donante = input ("Grupo del donante (A, B, AB, 0)".upper())
    receptor = input ("Grupo del receptor (A, B, AB, 0)".upper())

    if len(donante) < 2 or len(receptor) < 2:
        print("Formato incorrecto. Usa algo como 'A+' o '0-'")
        seguir = input("¿Comprobar otro par? (s/n): ").lower()
        continue

    g1, rh1 = donante[:-1], donante[-1]
    g2, rh2 = receptor[:-1], receptor[-1]

    gruposValidos = ["A", "B", "AB", "0"]
    rhsVvalidos = ["+", "-"]
    valido = True

    for elemento in [g1, g2]:
        if elemento not in gruposValidos:
            print(f"Grupo inválido: {elemento}")
            valido = False

    for rh in [rh1, rh2]:
        if rh not in rhsVvalidos:
            print(f"⚠️ Rh inválido: {rh}")
            valido = False

    if valido:
        if g1 == "0":
            compatiblesGrupo = ["0", "A", "B", "AB"]
        elif g1 == "A":
            compatiblesGrupo = ["A", "AB"]
        elif g1 == "B":
            compatiblesGrupo = ["B", "AB"]
        elif g1 == "AB":
            compatiblesGrupo = ["AB"]
        else:
            compatiblesGrupo = []

        if rh1 == "+":
            compatiblesrRh = ["+"]
        elif rh1 == "-":
            compatiblesRh = ["+", "-"]
        else:
            compatiblesRh = []

        if g2 in compatiblesGrupo and rh2 in compatiblesRh:
            match rh2:
                case "+":
                    print(f"{receptor} puede recibir de {donante} (Rh positivo)")
                case "-":
                    print(f"{receptor} puede recibir de {donante} (Rh negativo)")
        else:
            print(f"{receptor} no puede recibir de {donante}")
