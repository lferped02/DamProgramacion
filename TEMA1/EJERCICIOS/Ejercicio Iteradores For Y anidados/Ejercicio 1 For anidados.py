n = 15
resultado = 0

for i in range(n + 1):  # i va de 0 a 15 inclusive
    if i % 2 == 0:
        resultado = resultado + 2 * i
    else:
        resultado = resultado + 2 * i + 1

print("El resultado es:" + str(resultado))
