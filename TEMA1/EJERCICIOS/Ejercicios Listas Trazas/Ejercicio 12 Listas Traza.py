salir = False 
impares = []
numVeces = 0
while not salir:
    num1 = int(input("Introduce un numero: "))
    num2 = int(input("Introduce un segundo numero: ")) 
    if num2 % num1 == 0:
        salir = True
        print("Saliendo del programa")
    else:
        for i in range(num2, num1, -2):
            if i % 2 !=0:
                print (i)
                impares.append(i)
    print("En total existen", len(impares), "numeros impares en el rango")
    print("=====================================================")
    if numVeces > 2:
        salir = True
    else:
        numVeces+1
impares= []