arboles = []
opcion = ""

while opcion != "4":
    print("\nMENÚ")
    print("a. Número de árboles")
    print("b. Introducir datos")
    print("c. Ver resumen")
    print("e. Salir")
    print("f. Muestra los datos del arbol")

    opcion = input("Elige una opción (a-f): ")

    if opcion == "a":
        cantidad = int(input("¿Cuántos árboles vas a introducir? "))

    elif opcion == "b":
        arboles = []
        for i in range(cantidad):
            print("\nÁrbol", i + 1)
            tipo = input("Tipo (A o B): ")
            diametro = float(input("Diámetro: "))
            altura = float(input("Altura: "))
            if tipo == "B":
                edad = int(input("Edad: "))
                arboles.append([tipo, diametro, altura, edad])
            else:
                arboles.append([tipo, diametro, altura])

    elif opcion == "c":
        if len(arboles) == 0:
            print("No hay árboles guardados.")
        else:
            i = 1
            posMaxima=0
            maximaAltura=altura[0]
            while i<len(altura):
                if altura[i]>maximaAltura:
                    maximaAltura = altura[i]
                    posMaxima=i
                i=+1
            print("Arbol con mayor altura")
            print(f"Tipo: {tipo[posMaxima]}", f"Altura:{altura[posMaxima]}", f"Diametro: {diametro[posMaxima]}")


    elif opcion == "e":
        print("Fin del programa.")

    else:
        print("Opción incorrecta.")
