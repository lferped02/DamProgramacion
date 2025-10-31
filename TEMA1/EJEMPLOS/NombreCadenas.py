#=============================================================
                     #Las cadenas son inmutables
#=============================================================
nombre = "Lucia"
nombre.replace("a", "o")#No cambia la variable del nombre
print(nombre)
nombre = nombre.replace("a", "o")#Cambia la variable del nombre

#=============================================================
        #Paso de String a lista: lista(nombreCadena) 
    #lista a String: for y concatenar caracter a caracter
#=============================================================
nombreLista = list(nombre)#Si cambia nombre
nombreLista.insert(0,"a")#Paso de String a lista de caracteres
print(nombreLista)

cadenaSalida = ""
for valor in nombreLista:#Paso de lista de caracteres a String
    cadenaSalida+=valor
print(cadenaSalida)