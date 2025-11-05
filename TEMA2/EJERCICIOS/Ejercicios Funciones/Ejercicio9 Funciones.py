def convertisegundoahora (segundos):
    horas = int(segundos / 3600)
    return horas

def convertirsegundoaminutos (segundos):
    minutos = int (segundos/60)
    return minutos

segundos = int (input ("dame el tiempo en segundos:"))
horas = int (segundos / 3600)

menu = int (input ("introduce una opcion del menu:"))
while menu != 4 :
    segundos = int (input ("introuce el tiempo en segundo:"))

    resultado = convertisegundoahora (segundos), convertirsegundoaminutos (segundos)
    if menu == 1:
     print (segundos, "segundos")

    elif menu ==2:
     print (convertirsegundoaminutos (segundos), "minutos")
    
    elif menu == 3:
       print (convertisegundoahora (segundos), "horas")
    
    elif menu == 4:
       print ("saliendo del programa")

    menu = int (input ("introduce una opcion del menu:"))