numero = 123456789
numeros = 4 

temperatura = numero
contador = 0
while temperatura > 0:
    temperatura //= 10
    contador += 1
veces = contador - 1 - numeros

for i in range(veces):
    numero //= 10

digito = numero // 10 % 10 if veces == 0 else numero % 10

print("El dígito en la posición", numeros, "es:", digito)
