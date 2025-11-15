def leerNumeros():
    numeros = []
    for i in range(10):
        numero = int(input(f"Introduce el número {i+1}: "))
        numeros.append(numero)
    return numeros

def filtrarTerminanEn3(lista):
    return [n for n in lista if n % 10 == 3]

def main():
    numeros = leerNumeros()
    resultado = filtrarTerminanEn3(numeros)
    print("Números que terminan en 3:", resultado)

# Ejecutar el programa
main()
