# Ejercicio 1
def redondear(valor):
    numero = float(valor)
    mil = int(numero*1000)
    dosDecimales = mil // 10
    tercero = mil % 10
    if tercero >= 5:
        dosDecimales += 1
    resultado = dosDecimales / 100
    
    return resultado

# Programa principal
print(redondear(1.449))
print(redondear(1.444))
print(redondear(0.375))
print(redondear(0.374))
print(redondear(1))
