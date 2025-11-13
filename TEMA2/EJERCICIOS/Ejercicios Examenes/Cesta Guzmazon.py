#Carga cesta(dineroMaximo)
def cargaCesta(dineroMaximo):
    nombreProducto = []
    precio = []
    costeTotal = 0
    rep = True
    while rep:
        cesta = input("Introduce el producto: ").upper()
        nombreProducto.append(cesta)
        costeTotal = input("Introduce el coste total del producto: ")
        precio.append(costeTotal)
        total+=float(costeTotal)
        if float(total)>dineroMaximo:
            total-=float(costeTotal)
            lim = precio.index(costeTotal)
            nombreProducto.pop(lim)
            precio.pop(lim)
            rep= False
    return nombreProducto, precio, costeTotal

importeAGastar = float(input("Dime cuanto tienes para gastarte como maximo: "))

#Pinta menu
def pintarMenu():
    print("S. Pulsa la opcion S para calcular dinero sobrante")
    print("R. Pulsa la opcion R para eliminar un producto y su precio de la lista")
    print("C. Pulsa la opcion C para devolver la lista de productos cuyo precio es mas alto que un importe")

#Lee y valida opcion
def leeValidaOpcion():
    pintarMenu()
    opcion=input("Selecciona una opcion: ")
    while opcion !="S" and opcion !="R" and opcion !="C":
        opcion=input("Selecciona una opcion: ")
    while opcion !="":

        
resultados = cargaCesta(importeAGastar)
nombreProducto = resultados[0]
precio = resultados[1]
costeTotal = resultados[2]