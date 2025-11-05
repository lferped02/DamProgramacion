def esMultiplo(numero1, numero2):
    if numero2 == 0:
        return "No se puede dividir entre cero."
    return numero1 % numero2 == 0

# Entrada de datos
numero1 = int(input("Introduce el primer número: "))
numero2 = int(input("Introduce el segundo número: "))

# Resultado
resultado = esMultiplo(numero1, numero2)

if resultado == True:
    print(f"{numero1} es múltiplo de {numero2}.")
elif resultado == False:
    print(f"{numero1} no es múltiplo de {numero2}.")
else:
    print(resultado)
