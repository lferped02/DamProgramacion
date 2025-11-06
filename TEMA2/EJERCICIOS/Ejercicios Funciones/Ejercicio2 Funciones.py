def temperatura(maxima, minima):
    media = (maxima + minima) / 2
    return media

dia = int(input("Introduce número de días: "))

for i in range(dia):
    temperaturaMaxima = float(input(f"Introduce la temperatura máxima del día {i+1}: "))
    temperaturaMinima = float(input(f"Introduce la temperatura mínima del día {i+1}: "))
    resultadoFuncion = temperatura(temperaturaMaxima, temperaturaMinima)
    print(f"Media del día {i+1}: {resultadoFuncion:.2f}°C")
