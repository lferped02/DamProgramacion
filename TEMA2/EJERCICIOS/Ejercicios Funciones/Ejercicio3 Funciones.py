def convertir_espaciado(cadena):
    cadenaResultado = ""
    for c in cadena:
        if c != '':
            cadenaResultado += c + " "
    return cadenaResultado.strip()  # Elimina el espacio final

print(convertir_espaciado("Hola, tú"))
