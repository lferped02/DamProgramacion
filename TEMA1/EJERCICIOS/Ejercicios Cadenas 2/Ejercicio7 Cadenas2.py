nombreCompleto = input("Escribe tu nombre y apellidos: ")
partes = nombreCompleto.split()
iniciales = ""
for palabra in partes:
    iniciales += palabra[0].upper()
print("Iniciales:", iniciales)
