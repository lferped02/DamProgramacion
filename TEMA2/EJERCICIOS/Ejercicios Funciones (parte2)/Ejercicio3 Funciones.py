# Función para leer 10 números
def leerNumeros():
    numeros = []
    for i in range(10):
        numero = int(input("Introduce un número: "))
        numeros.append(numero)
    return numeros

# Función para filtrar los que terminan en 3
def filtrarTerminanEn3(lista):
    resultado = []
    for n in lista:
        if n % 10 == 3:
            resultado.append(n)
    return resultado

# Programa principal
numeros = leerNumeros()
resultado = filtrarTerminanEn3(numeros)
print(f"Los números que terminan en 3 son: {resultado}")
