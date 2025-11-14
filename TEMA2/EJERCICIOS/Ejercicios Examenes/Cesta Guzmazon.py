#Carga cesta(dineroMaximo)
def cargaCesta(dineroMaximo):
    nombreProducto = []
    precio = []
    total = 0
    rep = True

    while rep:
        cesta = input("Introduce el producto (o 'FIN' para terminar): ").upper()
        if cesta == "FIN":
            rep = False
        else:
            precioProducto = float(input("Introduce el coste del producto: "))

            if total + precioProducto > dineroMaximo:
                print("No puedes añadir este producto, supera el máximo permitido.")
                rep = False
            else:
                nombreProducto.append(cesta)
                precio.append(precioProducto)
                total += precioProducto

    return nombreProducto, precio, total

importeAGastar = float(input("Dime cuanto tienes para gastarte como maximo: "))

#Pinta menu
def pintarMenu(resultado, nombre, precios, costeTotal):
    print(f"Importe maximo a gastar: {resultado}€")
    print(f"Productos: {nombre}")
    print(f"Precios: {precios}")
    print(f"El coste total es de: {costeTotal}")

    print("S. Pulsa la opcion S para calcular dinero sobrante")
    print("R. Pulsa la opcion R para eliminar un producto y su precio de la lista")
    print("C. Pulsa la opcion C para devolver la lista de productos cuyo precio es mas alto que un importe")

#Lee y valida opcion
def leeValidaOpcion():
    pintarMenu()
    opcion=input("Selecciona una opcion: ").upper

#Calcula sobrante
def calculaSobrante(totalGastado, presupuesto):
    sobrante = presupuesto - totalGastado
    return sobrante

#Elimina producto carrito
def eliminaProductoCarrito(productos, precios):
    print(f"Esta es la lista de producto: {productos}")
    print(f"Esta es la lista de precios:{precios}")
    nombreProducto = input("Introduce el nombre del producto: ")
    validacion = input("¿Seguro que quieres eliminar este producto) (S/N)").upper()
    if validacion =="S":
        pos = productos.index(nombreProducto)
        productos.pop(pos)
        precios.pop(pos)
        return productos, precios
#Calcula productos caros
def calculaProductosCaros(productos, precios, importe):
    print("Productos caros")
    caros = []
    for i in range(len(precios)):
        if precios[i] > importe:
            caros.append((productos[i], precios[i]))
            print(f"{productos[i]}: {precios[i]}€")
    return caros

resultados = cargaCesta(importeAGastar)
pintarMenu(resultados[1], resultados[2], resultados[3], resultados[0])
nombreProducto = resultados[0]
precio = resultados[1]
costeTotal = resultados[2]
gastar = resultados[3]
calculaSobrante(gastar,costeTotal)

