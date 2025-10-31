frase = "Esto es un ejemplo"
subcadena = "ejemplo"
resultado = ""

# Tomamos la letra en la posición 1 de la frase (es la letra 's')
# y la juntamos con la palabra 'ejemplo'
print(frase[1] + subcadena)  # Resultado: sejemplo

# Tomamos la letra 's' y los primeros 3 caracteres de 'ejemplo' ('eje')
# y los juntamos
print(frase[1] + subcadena[:3])  # Resultado: seje

# Buscamos la primera vez que aparece la letra 's' en la frase
# Está en la posición 2, así que mostramos desde ahí hasta el final
print(frase[frase.find("s"):])  # Resultado: to es un ejemplo

# Creamos otra frase
cadena = "HOLA LOLA"

# Cambiamos todas las letras 'L' por 'C'
cadena = cadena.replace("L", "C")

# Mostramos el resultado
print(cadena)  # Resultado: HOCA COCA
