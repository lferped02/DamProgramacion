diasSemana=["Lunes", "Martes", "Miercoles", "Jueves", "Viernes"]
print (diasSemana[1])
#print (len ("días de la semana")) #Esto imprime 17
#print (len (diasSemana)) #Esto imprime 5
#print (len (diasSemana[0])) #Esto imprime 5, porque "Lunes" tiene 5 letras

#Agrega
diasSemana.append("Viernes")#Agrego el final
diasSemana.insert(2,"Miercoles")#Agrego la posición 2
print (diasSemana)

#Añade y concatena listas
diasFinSemana =["Sabado", "Domingo"]
diasSemana+=diasFinSemana #Concatenar dos listas
#Elimina 
diasSemana.pop(6) #Borrador por posición
diasSemana.remove("Martes") #Borra el valor
print (diasSemana)

print (diasSemana.index("Lunes")) #Devuelve en qué posición está ese valor

if "Martes2" in diasSemana: #Para comprobar si la lista contiene un valor o no
    print ("Esta en la lista") #Devuelve en que posición esta el valor.
    print (diasSemana.index(diasSemana))
else:
    print ("No está en la lista")

for valorLista in diasSemana:
    print (valorLista)

for i in range (len(diasSemana)):
    print (diasSemana)