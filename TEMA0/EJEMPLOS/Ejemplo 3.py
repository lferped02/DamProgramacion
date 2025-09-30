num1 = int (input("Lee el primer numero:"))
num2 = int (input("Lee el segundo numero: "))

if num2 !=0: #(significa "no" o ""negación")
    resultado = int (num1/num2) 
    print ("El resultado de la division es:", resultado)
else:
    print ("ERROR. No se puede dividir entre 0.")