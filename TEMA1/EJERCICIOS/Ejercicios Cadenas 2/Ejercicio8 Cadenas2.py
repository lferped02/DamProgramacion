nombreCompleto = input("Escribe tu nombre y apellidos: ")
partes = nombreCompleto.split()
modificado = []
for palabra in partes:
    if len(palabra) == 1:
        nueva = palabra.upper()
    else:
        nueva = palabra[0].upper() + palabra[1:-1].lower() + palabra[-1].upper()
    modificado.append(nueva)

resultado = ""
for palabra in modificado:
    resultado += palabra + " "
print(resultado.strip())

