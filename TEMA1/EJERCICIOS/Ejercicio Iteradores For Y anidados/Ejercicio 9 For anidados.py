numero = int(input("Dame un número:"))
div = 1
resultadoDivision = 1000000

while resultadoDivision != 0:
    div = div * 10
    resultadoDivision = numero // div
    resultadoResto = numero % div #No extrae digito individuales, si no imprime los ultimos numeros digitos.
    print(resultadoResto)
