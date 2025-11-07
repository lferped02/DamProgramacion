#Toma el valor del nombre "Antonio"
def saludar(nombre):
    print("Hola", nombre)
saludar("Antonio")

#Toma el valor desconocido
def saludar(nombre ="No recibe nombre"):
    print("Hola", nombre)
saludar()

cadena="Fuera de la funcion"

#Dentro del método veo: lo que recibe como argumento o la que defino dentro
nombre = "Antonio"
profesion = "Torero"
#Definición función
def dimeQueHaces(nombre, profesion):
    print(nombre,"es", profesion)
dimeQueHaces(nombre, profesion)