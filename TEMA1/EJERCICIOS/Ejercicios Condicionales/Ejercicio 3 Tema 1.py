vip = (input ("¿Eres VIP? (SI/NO): "))

if vip == "SI":
    print ("Descuento")
else: 
    gasto = float (input ("Dime importe gastado: "))
    if gasto > 100:
        print ("No descuento")
print ("FIN")