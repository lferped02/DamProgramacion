def temperatura (num, num2):
    media = (num + num2)/2
    return media

dia = input ("introduce numero de dia:")
for i in range (0, dia):
    temperatura_maxima = input ("dame la temperatura maxima del dia:")
    temperatura_minima = input ("dame la temperatura minima del dia:")
    resultadofuncion= temperatura (temperatura_maxima, temperatura_minima)

print (resultadofuncion)