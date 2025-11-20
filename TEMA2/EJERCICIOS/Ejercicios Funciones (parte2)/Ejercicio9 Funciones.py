import random

# Conocer el número mayor
def obtenerMayor(lista):
    mayor = lista[0]
    for numero in lista:
        if numero > mayor:
            mayor = numero
    return mayor

# Conocer el número menor
def obtenerMenor(lista):
    menor = lista[0]
    for numero in lista:
        if numero < menor:
            menor = numero
    return menor

# Obtener la suma total de todos los números
def sumaTotal(lista):
    total = 0
    for numero in lista:
        total += numero
    return total

# Obtener la media
def calcularMedia(lista):
    return sumaTotal(lista) / len(lista)

# Sustituir el valor de un elemento por otro número introducido por teclado
def sustituirElemento(lista, posicion, nuevoValor):
    lista[posicion] = nuevoValor
    print("Elemento sustituido.")

# Mostrar la lista
def mostrarLista(lista):
    print(lista)


# --- Programa principal ---
# Paso 1: generar 100 números aleatorios
numeros = []
for i in range(100):
    numeros.append(random.randint(0, 1000))

# Paso 2: mostrar menú hasta que el usuario decida salir
opcion = ""
while opcion != "7":
    print("\n--- MENÚ ---")
    print("1. Conocer el mayor")
    print("2. Conocer el menor")
    print("3. Obtener la suma de todos los números")
    print("4. Obtener la media")
    print("5. Sustituir un valor")
    print("6. Mostrar todos los números")
    print("7. Salir")

    opcion = input("Elige una opción: ")

    if opcion == "1":
        print(f"El mayor es: {obtenerMayor(numeros)}")
    elif opcion == "2":
        print(f"El menor es: {obtenerMenor(numeros)}")
    elif opcion == "3":
        print(f"La suma total es: {sumaTotal(numeros)}")
    elif opcion == "4":
        print(f"La media es: {calcularMedia(numeros)}")
    elif opcion == "5":
        pos = int(input("Introduce la posición (0-99): "))
        nuevo = int(input("Introduce el nuevo valor: "))
        sustituirElemento(numeros, pos, nuevo)
    elif opcion == "6":
        mostrarLista(numeros)
    elif opcion == "7":
        print("¡Hasta luego!")
    else:
        print("Opción no válida, intenta otra vez.")
