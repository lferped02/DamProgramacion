# Calcular la media
def calcularMedia(lista):
    total = 0
    for numero in lista:
        total += numero
    return total / len(lista)

# Cuenta los números pares
def contarPares(lista):
    contador = 0
    for numero in lista:
        if numero % 2 == 0:
            contador += 1
    return contador

# Cuenta los números negativos
def contarNegativo(lista):
    contador = 0
    for numero in lista:
        if numero < 0:
            contador += 1
    return contador

# La suma total de los números
def sumaTotal(lista):
    total = 0
    for numero in lista:
        total += numero
    return total

# Programa principal
n = int(input("¿Cuántos números quieres introducir? "))
numeros = []

for i in range(n):
    numero = int(input(f"Introduce el número {i+1}: "))
    numeros.append(numero)

# Aquí ya tenemos la lista completa
opcion = ""   

while opcion != "5":   
    print("\n--- MENÚ ---")
    print("1. Calcular la media")
    print("2. Contar cuántos son pares")
    print("3. Contar cuántos son negativos")
    print("4. Calcular la suma total")
    print("5. Salir")

    opcion = input("Elige una opción: ")

    if opcion == "1":
        print(f"La media es: {calcularMedia(numeros)}")
    elif opcion == "2":
        print(f"Cantidad de pares: {contarPares(numeros)}")
    elif opcion == "3":
        print(f"Cantidad de negativos: {contarNegativo(numeros)}")
    elif opcion == "4":
        print(f"La suma total es: {sumaTotal(numeros)}")
    elif opcion == "5":
        print("¡Hasta luego!")
    else:
        print("Opción no válida, intenta otra vez.")
