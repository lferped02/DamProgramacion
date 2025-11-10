# Apartado A:
jugador1 = ""
while jugador1 != "pares" and jugador1 != "nones":
    jugador1 = input("Jugador 1, ¿pares o nones?: ").lower()

if jugador1 == "pares":
    jugador2 = "nones"
else:
    jugador2 = "pares"

dedos1 = -1
while dedos1 < 0 or dedos1 > 5:
    dedos1 = int(input("Jugador 1, ¿cuántos dedos sacas? (0 a 5): "))

dedos2 = -1
while dedos2 < 0 or dedos2 > 5:
    dedos2 = int(input("Jugador 2, ¿cuántos dedos sacas? (0 a 5): "))

suma = dedos1 + dedos2
print(f"Suma de dedos {suma}:")

if suma % 2 == 0:
    print("¡Gana quien eligió pares!")
else:
    print("¡Gana quien eligió nones!")

# Apartado B:
ganadasJ1 = 0
ganadasJ2 = 0
fin = False

while not fin:
    jugador1 = ""
    while jugador1 != "pares" and jugador1 != "nones":
        jugador1 = input("\nJugador 1, ¿pares o nones?: ").lower()

    if jugador1 == "pares":
        jugador2 = "nones"
    else:
        jugador2 = "pares"

    dedos1 = -1
    while dedos1 < 0 or dedos1 > 5:
        dedos1 = int(input("Jugador 1, ¿cuántos dedos sacas? (0 a 5): "))

    import random
    dedos2 = random.randint(0, 5)
    print("Jugador 2 (máquina) saca", dedos2, "dedos.")

    if dedos1 == 0 and dedos2 == 0:
        fin = True
    else:
        suma = dedos1 + dedos2
        print(f"Suma de dedos{suma}:")

        if suma % 2 == 0:
            ganador = "pares"
        else:
            ganador = "nones"

        if jugador1 == ganador:
            print("¡Jugador 1 gana esta partida!")
            ganadasJ1 += 1
        else:
            print("¡Jugador 2 (máquina) gana esta partida!")
            ganadasJ2 += 1

print("\nFin del juego.")
print(f"Jugador 1 ganó {ganadasJ1} partidas.")
print(f"Jugador 2 (máquina) ganó {ganadasJ2} partidas.")