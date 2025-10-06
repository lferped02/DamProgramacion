numero = int(input("Introduce un número mayor que 0: "))

if numero > 0:
    suma = 0
    for i in range(1, numero + 1):
        suma = suma + i
    print("La suma de los primeros", numero, "números es:", suma)
else:
    print("Número inválido. El programa ha finalizado.")
print ("FIN DEL PROGRAMA")