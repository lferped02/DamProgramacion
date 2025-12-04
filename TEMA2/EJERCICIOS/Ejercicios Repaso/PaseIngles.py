import random

def tirarDado():
    return random.randint(1, 6)

def apostar(historial, saldo):
    numero = int(input("¿A qué número (entre 2 y 12) quieres apostar?: "))
    if numero < 2 or numero > 12:
        print("Número inválido. Debe estar entre 2 y 12.")
        return saldo

    cantidad = int(input("¿Cuánto quieres apostar?: "))

    dado1 = tirarDado()
    dado2 = tirarDado()
    suma = dado1 + dado2

    if suma == numero:
        ganancia = cantidad * 2
        saldo += ganancia
        resultado = f"ganando {ganancia}€"
    else:
        saldo -= cantidad
        resultado = f"perdiendo {cantidad}€"

    historial.append((numero, suma, resultado))
    print(f"Has apostado al {numero}, salió {suma}, {resultado}.")
    return saldo

def mostrarHistorial(historial):
    if len(historial) == 0:
        print("No hay jugadas registradas.")
    else:
        jugadaNumero = 1
        for jugada in historial:
            numero, suma, resultado = jugada
            print(f"En la {jugadaNumero}º jugada apostó al valor {numero} y sumó {suma}, {resultado}")
            jugadaNumero += 1

def retirarse(saldo):
    print(f"Saldo final neto: {saldo}€")
    print("Gracias por jugar. ¡Hasta pronto!")

def menu():
    historial = []
    saldo = 0
    salir = False
    while not salir:
        print("\n--- MENÚ ---")
        print("1. Apostar")
        print("2. Mostrar historial de jugadas")
        print("3. Retirarse")
        opcion = input("Elige una opción: ")

        if opcion == "1":
            saldo = apostar(historial, saldo)
        elif opcion == "2":
            mostrarHistorial(historial)
        elif opcion == "3":
            retirarse(saldo)
            salir = True
        else:
            print("Opción inválida. Intenta de nuevo.")

# Programa principal
menu()
