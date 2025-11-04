cadena = input("Escribe una cadena de texto: ")
caracter1 = input("Escribe el carácter que quieres reemplazar: ")

while len(caracter1) != 1:
    print("Solo se permite un carácter.")
    caracter1 = input("Intenta de nuevo: ")

caracter2 = input("Escribe el carácter nuevo: ")

while len(caracter2) != 1:
    print("Solo se permite un carácter.")
    caracter2 = input("Intenta de nuevo: ")

# Reemplazo usando replace
cadenaModificada = cadena.replace(caracter1, caracter2)
print(f"Cadena modificada: {cadenaModificada}")
