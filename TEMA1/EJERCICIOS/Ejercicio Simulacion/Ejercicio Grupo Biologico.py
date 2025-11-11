arboles = []
opcion = ""

while opcion != "4":
    print("\nMENÚ")
    print("1. Número de árboles")
    print("2. Introducir datos")
    print("3. Ver resumen")
    print("4. Salir")

    opcion = input("Elige una opción (1-4): ")

    if opcion == "1":
        cantidad = int(input("¿Cuántos árboles vas a introducir? "))

    elif opcion == "2":
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

    elif opcion == "3":
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
            print("Árboles con más de 30 m:", cuentaAltos)

    elif opcion == "4":
        print("Fin del programa.")

    else:
        print("Opción incorrecta.")
