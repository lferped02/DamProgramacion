numero = int (input ("Introduce un numero: "))

for i in range(numero):
    if i == 1 or i == numero:
        print ("*","#"*(numero-2)+"*")
    else:
        print ("*","*"*(numero-3)+"*")
