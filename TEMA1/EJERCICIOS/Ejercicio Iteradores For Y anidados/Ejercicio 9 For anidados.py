numero = int(input("Dame un número:"))
div= 1
resultadoDivision= 1000000
while resultadoDivision != 0:
    div = div*10
    resultadoDivision = numero //div
    resultadoResto = numero % div
    print(resultadoResto )
