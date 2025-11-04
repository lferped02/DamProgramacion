clientes = []
#Apartado 1. Amazon Guzmanes
opcion = ""
while opcion != "G":
    # Mostrar menú
    print("===========================================================")
    print("Selecciona una de las siguientes opciones (A, V, C, M, G): ")
    print("A) Añadir cliente")
    print("V) Validar emails almacenados")
    print("C) Contar clientes de un dominio")
    print("M) Mostrar los % de clientes premium y normales")
    print("G) Salir")
    print("===========================================================")
    opcion = input("Selecciona una opción: ").strip().upper()

    #Opcion A: Al añadir un cliente:
    if opcion == "A":
        tipo = ""
        while tipo not in ["S", "N"]:
            tipo = input("¿Es cliente premium? (S/N): ").strip().upper()
            if tipo not in ["S", "N"]:
                print("Entrada no válida. Introduce 'S' o 'N'")
        email = input("Introduce el correo electrónico del cliente: ").strip()
        cliente = tipo + "|" + email
        clientes.append(cliente)
    
    #Apartado 2. Opcion V: Validar emails almacenados:
    elif opcion == "V":
        print("Validación de emails: ")
        for cliente in clientes:
            partes = cliente.split("|")
            email = partes[1]
        # Validación alternativa usando split
        if "@" in email and "." in email:
            secciones = email.split("@")
            if len(secciones) == 2 and secciones[0] != "" and "." in secciones[1]:
                print(email + " → VÁLIDO")
            else:
                print(email + " → INVÁLIDO")
        else:
            print(email + " → INVÁLIDO")

    #Apartado 3. Opcion C: Contar clientes de dominio:
    elif opcion == "C":
        dominio = input("Introduce el dominio a buscar: ").strip()
        contador = 0
        for cliente in clientes:
            email = cliente.split("|")[1]
            partes = email.split("@")
            if len(partes) == 2 and partes[1] == dominio:
                contador +=1
        print("Número de clientes con dominio '" + dominio + "':", contador)

    #Apartado 4. Opcion M: Mostrar los % de clientes premium y normales:
    elif opcion == "M":
        total = len(clientes)
        if total == 0:
            print("No hay clientes registrados")
        else:
            premium = 0
            for cliente in clientes:
                tipo = cliente.split("|")[0]
                if tipo == "S":
                    premium +=1
            normales = total-premium
            porcentajePremium = round(premium*100 / total, 2)
            porcentajeNormales = round(normales*100 / total, 2)
            print(f"Clientes premium: {porcentajePremium}%")
            print(f"Clientes normales: {porcentajeNormales}%")

    #Apartado 5. Opcion G: Salir:
    elif opcion == "G":
        print("Saliendo del programa")
    else:
        print("Opción no válida. Intenta de nuevo")
