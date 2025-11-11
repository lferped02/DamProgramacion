arboles = []
opcion = ""

while opcion != "4":
    print("\nMENÚ")
    print("a. Número de árboles")
    print("b. Introducir datos")
    print("c. Ver resumen")
    print("e. Salir")

    opcion = input("Elige una opción (1-4): ")

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
            maximaAltura = 0
            minimaAltura = 1000
            sumaEdades = 0
            cuentaB = 0
            cuentaAltos = 0

            for a in arboles:
                tipo = a[0]
                diametro = a[1]
                altura = a[2]

                if altura > maximaAltura:
                    maximaAltura = altura
                if altura < minimaAltura:
                    minimaAltura = altura
                if altura > 30:
                    cuentaAltos += 1
                if tipo == "B" and len(a) == 4:
                    edad = a[3]
                    sumaEdades += edad
                    cuentaB += 1

            print("\nRESUMEN")
            print("Altura máxima:", maximaAltura, "m")
            print("Altura mínima:", minimaAltura, "m")
            if cuentaB > 0:
                print("Media de edad tipo B:", round(sumaEdades / cuentaB), "años")
            else:
                print("No hay árboles tipo B.")
            print(f"Árboles con más de 30 m {cuentaAltos}:")

    elif opcion == "e":
        print("Fin del programa.")

    else:
        print("Opción incorrecta.")
