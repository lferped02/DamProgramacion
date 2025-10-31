cadena = input("Escribe una cadena de texto: ")
caracter1 = input("Escribe el carácter que quieres reemplazar: ")

while len(caracter1) != 1:
    caracter1 = input("Solo se permite un carácter. Intenta de nuevo: ")
caracter2 = input("Escribe el carácter nuevo: ")

while len(caracter2) != 1:
    caracter2 = input("Solo se permite un carácter. Intenta de nuevo: ")
cadenaModificada = cadena.replace(caracter1, caracter2)
print(f"Cadena modificada {cadenaModificada}:")
