numero = int (input ("Introduce un número: "))
suma = 0

while numero > 0:
    digito = numero % 10
    suma += digito
    numero = numero // 10

print("La suma de los dígitos es:", suma)
