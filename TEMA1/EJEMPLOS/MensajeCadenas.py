#Se usa principalmente con cadenas de texto (strings) 
#para buscar la posición de una subcadena dentro de otra.
mensaje= "Hola Mundo"
mensaje = mensaje.find ("Mundo")
print (mensaje)

#Una cadena y devuelve el índice (posición) donde comienza.
#Si no la encuentra, devuelve -1.
mensaje= "Hola Mundo"
mensaje = mensaje.find ("Mando")
print (mensaje)

#Reemplazar parte de la cadena
mensaje = "HOLA MUNDO"
mensaje = mensaje.replace ("L", "Pizza")
print (mensaje)

txt = "Bienvenidos,a,la,clase,de,programación"
lista = txt.split(',') # En este caso el separador es la coma
['Bienvenidos', 'a', 'la', 'clase', 'de', 'programación']
print (lista)