primero = segundo = -1  
while not (primero == 0 and segundo == 0):
    primero = int(input("Introduce el primer número: "))
    segundo = int(input("Introduce el segundo número: "))

    if primero == 0 and segundo == 0:
        print("Programa finalizado.")
    elif primero >= segundo:
        print("El primer número debe ser menor que el segundo. Inténtalo de nuevo.")
    else:
        tipo = input("¿El intervalo es abierto o cerrado? ")

        if tipo == "abierto" or tipo == "Abierto":
            inicio = primero + 1
            fin = segundo - 1
        else:
            inicio = primero
            fin = segundo

        impares = []
        for x in range(inicio, fin + 1):
            if x % 2 != 0:
                impares.append(x)

        print("================================================")
        print("Impares que existen entre [", primero, "-", segundo, "] (", tipo, "): ", sep="", end="")

        # Mostrar sin join ni map
        for i in range(len(impares)):
            if i < len(impares) - 1:
                print(impares[i], end=", ")
            else:
                print(impares[i])

        print("En total existen", len(impares), "números impares en el rango.")
        print("================================================")
