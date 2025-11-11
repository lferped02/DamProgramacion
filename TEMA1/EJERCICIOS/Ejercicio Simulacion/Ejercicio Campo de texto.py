# Apartado 1:
letra = input("Introduce una letra: ")
listaPalabras = []
opcion = ""

print("Introduce palabras, escribe stop si no deseas guardar más palabras")

palabra = "".lower()
while palabra != "stop":
    palabra = input("Palabra: ")
    if palabra != "stop":
        listaPalabras.append(palabra)

print(f"\nLa letra introducida es: {letra}")
print(f"La lista de palabras es: {listaPalabras} y el número de palabras introducidas es: {len(listaPalabras)}")

#Apartado 2:
print("\nMenú de opciones:")
print("Introduzca E si desea devolver la lista de palabras que comienzan por la letra")
print("Introduzca C si desea devolver la lista de palabras que contienen la letra")
print("Introduzca S para terminar el programa")

opcion = input("Opción: ").upper()

while opcion != "S":
    if opcion == "E":
        empieza=[]
        for palabra in listaPalabras:
            if palabra[0]== letra:
                empieza.append(palabra)
        print(f"Esta lista de palabra comienzan con la letra{letra}: ")
    
    elif opcion =="C":
        devolver =[]
        for i in listaPalabras:
            for letra in palabra:
                devolver.append(palabra)
        print(f"La lista de palabra que contiene la letra{letra}: ")
    
    elif opcion == "S":
        print("Fin del programa.")

    else:
        print("Opción incorrecta.")