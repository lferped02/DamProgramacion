numero = int (input ("Introduce un número: "))

while numero > 0:
    digito = numero % 10
    print (digito)
    numero = numero // 10
