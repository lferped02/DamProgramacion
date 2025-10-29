cadena = "3223"
ultimaPosicion = len(cadena) - 1
posicionMedia = len(cadena) // 2 #la división es entera

for numero in range(posicionMedia):
    if cadena[numero] == cadena[ultimaPosicion - numero]:
        print("El numero esCapicua")
    else:
        print("El numero no esCapicua")
