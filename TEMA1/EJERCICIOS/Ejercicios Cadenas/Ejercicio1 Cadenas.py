capicua = True
cadena = "32123"
ultimaPosicion = len(cadena) - 1
posicionMedia = len(cadena) // 2 #la división es entera

for numero in range(posicionMedia):
    if cadena[numero] != cadena[ultimaPosicion - numero]:
        capicua = False
print (capicua)
