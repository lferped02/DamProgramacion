frase = "Esto es un ejemplo"

# Busca la letra "o" y muestra su posición (la primera que encuentra)
print(frase.find("o"))     # Resultado: 3

# Hace lo mismo que find: busca "o" y muestra su posición
print(frase.index("o"))    # Resultado: 3

# Busca la letra "M" (mayúscula), pero no está en la frase
print(frase.find("M"))     # Resultado: -1

# Intenta buscar "M" con index, pero como no está, da error
print(frase.index("M"))    # Esto da error y detiene el programa

# Convierte la frase a mayúsculas y busca "M"
# Ahora sí aparece en "EJEMPLO", en la posición 15
print(frase.upper().find("M"))  # Resultado: 15
