numero = input("Escribe un número entero: ")
if numero.isdigit():
    resultado = ""
    contador = 0

    for digito in reversed(numero):
        if contador and contador % 3 == 0:
            resultado = "." + resultado
        resultado = digito + resultado
        contador += 1
    print(f"Número con puntos {resultado}:")
else:
    print("Solo se permiten números enteros positivos.")
