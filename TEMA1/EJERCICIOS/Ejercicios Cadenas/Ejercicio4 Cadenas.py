numero = 123456789
posicion = 4  # Contando desde la derecha, empezando en 0

# Eliminamos los últimos 'posicion' dígitos
for _ in range(posicion):
    numero //= 10

# El dígito deseado es el último ahora
digito = numero % 10

print("El dígito en la posición", posicion, "es:", digito)
