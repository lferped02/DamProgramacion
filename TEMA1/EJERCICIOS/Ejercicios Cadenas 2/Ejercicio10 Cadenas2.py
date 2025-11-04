numero = input("Escribe un número entero: ")
esValido = True
for caracter in numero:
    if caracter < "0" or caracter > "9":
        esValido = False
if esValido:
    resultado = ""
    contador = 0
    indice = len(numero) - 1
    while indice >= 0:
        digito = numero[indice]
        if contador != 0 and contador % 3 == 0:
            resultado = "." + resultado
        resultado = digito + resultado
        contador += 1
        indice -= 1
    print(f"Número con puntos {resultado}")
else:
    print("Solo se permiten números enteros positivos.")
