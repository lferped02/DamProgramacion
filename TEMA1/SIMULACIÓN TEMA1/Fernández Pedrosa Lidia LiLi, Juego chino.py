import random

# Inicializamos contadores
rondas_jugador = 0
rondas_maquina = 0
total_partidas = 0
apuestas_humanas = {"P": 0, "I": 0}

print("¡Bienvenido al juego clásico de los chinos!")

while True:
    # Validación de piedras humanas
    while True:
        try:
            piedras_humano = int(input("¿Cuántas piedras muestras? (0 a 5): "))
            if 0 <= piedras_humano <= 5:
                break
            else:
                print("Número fuera de rango. Intenta de nuevo.")
        except ValueError:
            print("Entrada inválida. Escribe un número entre 0 y 5.")

    # Apuesta humana
    apuesta_humano = input("¿Apuestas por par (P) o impar (I)? ").upper()
    if apuesta_humano != "P":
        apuesta_humano = "I"
    apuestas_humanas[apuesta_humano] += 1

    # Movimiento de la máquina
    piedras_maquina = random.randint(0, 5)
    apuesta_maquina = random.choice(["P", "I"])

    # Mostrar jugadas
    print(f"Tú sacaste {piedras_humano} piedra(s) y apostaste por {'par' if apuesta_humano == 'P' else 'impar'}.")
    print(f"La máquina sacó {piedras_maquina} piedra(s) y apostó por {'par' if apuesta_maquina == 'P' else 'impar'}.")

    # Calcular suma y determinar ganador
    suma = piedras_humano + piedras_maquina
    es_par = suma % 2 == 0
    print(f"La suma total es {suma}, que es {'par' if es_par else 'impar'}.")

    if (es_par and apuesta_humano == "P") or (not es_par and apuesta_humano == "I"):
        print("¡Ganaste esta ronda!")
        rondas_jugador += 1
    else:
        print("La máquina gana esta ronda.")
        rondas_maquina += 1

    total_partidas += 1

    # Condición de fin (apartado 2)
    if piedras_humano == piedras_maquina:
        print("Ambos sacaron el mismo número de piedras. Fin.")
        break

# Resultados finales (apartado 3)
print("\n📊 Resultados finales:")
print(f"Rondas ganadas por el jugador: {rondas_jugador}")
print(f"Rondas ganadas por la máquina: {rondas_maquina}")
print(f"Número total de partidas: {total_partidas}")

# Apuesta más frecuente
apuesta_frecuente = max(apuestas_humanas, key=apuestas_humanas.get)
print(f"Apuesta humana más frecuente: {'par' if apuesta_frecuente == 'P' else 'impar'}")
