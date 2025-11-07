seguir = True
while seguir:
    primero  = int(input("Introduce el primer numero: "))
    segundo  = int(input("Introduce el segundo numero: "))

    if primero == 0 and segundo==0:
        print ("FIN")
        seguir = False
    else:
        while primero>=segundo:
            print("El primer numero debe ser menor que el segundo")
            primero  = int(input("Introduce el primer numero: "))
            segundo  = int(input("Introduce el segundo numero: "))
        print( "Impares que existen entre[", str(primero) - str(segundo), "]: ")

        i = primero
        impares = []
        while i<=segundo:
            if i%2 !=0:
                impares.append(i)
            i=+1
        
        print(impares)
