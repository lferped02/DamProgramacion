# Apartado 1:
letra = input("Introduce una letra: ")
listaPalabras = []
palabras= ""

print("Introduce palabras, escribe stop si no deseas guardar más palabras")

palabra = "".lower()
while palabra != "stop":
    palabra = input("Palabra: ")
    if palabra != "stop":
        listaPalabras.append(palabra)

print(f"\nLa letra introducida es: {letra}")
print(f"La lista de palabras es: {listaPalabras} y el número de palabras introducidas es: {len(listaPalabras)}")

#Apartado 2:
opcion = ""
while opcion !="5":
    print("\nMENU")
    print("E. Introduzca E si desea devolver la lista de palabras que comienzan por la letra")
    print("C. Introduzca C si desea devolver la lista de palabras que contienen la letra")
    print("L. Introduzca L, la palabras ordenadas por longitud (sin repetir")
    print("S. Introduzca S para terminar el programa")

    opcion = input("Elige una opcion: ").upper()

#Apartado 3:
    if opcion == "E":
        empieza= input("Introduce la secuencia de caracteres:").lower()
        listaE = []
        for i in listaPalabras:
            if palabras.lower()[0:len(empieza)]==empieza:
                if palabras not in listaE:
                    listaE.append(palabras)
        print(f"La palabra que empiezan por esa secuencia{listaE}: ")
#Apartado 4:
    elif opcion =="C":
        listaC = []
        for i in listaPalabras:
            if letra in i.lower() and i not in listaC:
                listaC.append(i)
        print(f"La palabra que contienen la letra {listaC}")

#Apartado 5:
    elif opcion == "L":
        if len(listaPalabras)>0:
            palabraCorta = listaPalabras[0]
            palabraLarga = listaPalabras[0]
            for i in listaPalabras:
                if len(i)<len(palabraCorta):
                    palabraCorta = i
                if len(i)<len(palabraLarga):
                    palabraLarga = i
            print(f"La palabra mas corta es {palabraCorta}: ")
            print(f"La palabra mas larga es {palabraLarga}: ")
        else: 
            print("No hay palabras para comparar")

#Apartado 6:
    elif opcion == "S":
        print("Programa finalizada")
    else:
        print("Opcion no valida. Intentelo de nuevo")
