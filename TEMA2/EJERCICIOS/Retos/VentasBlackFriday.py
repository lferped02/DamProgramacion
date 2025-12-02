ventas=[["Portátil", 150, 799.99, 4.5],
        ["Smartphone", 250, 599.99, 4.3],
        ["Auriculares", 400, 49.99, 4.0],
        ["Tablet", 120, 299.99, 3.9],
        ["Monitor", 180, 199.99, 4.2],
        ["Smartwatch", 220, 149.99, 4.1],
        ["Teclado mecánico", 300, 89.99, 4.4],
        ["Ratón gaming", 350, 59.99, 4.0],
        ["Cámara digital", 90, 999.99, 4.6],
        ["Consola", 200, 399.99, 4.7]]

#Apartado1
def getProducto(ventas, nombreProducto):
    producto=[]
    i=0
    encontrado = False
    while i < len(ventas) and not encontrado:
        if ventas[i][0] == nombreProducto:
            producto = ventas[i]
            encontrado = True
        else:
            i+=1
    return producto

def calculaIngresos(ventas, nombreProducto):
    filaProducto = getProducto(ventas, nombreProducto)
    if filaProducto:
        filaProducto[1]*filaProducto[2]
    return 0

#Apartado2
def productoDestacado(ventas, nombreProducto):
    valoracionMedia = getProducto(ventas, nombreProducto)
    devuelve = False
    if len(valoracionMedia)>0:
        if valoracionMedia[3]>=4.2:
            devuelve = True
        else:
            devuelve = False
    return devuelve

#Apartado2.1
def getProductoDestacado(ventas):
    lista=[]
    for elemento in ventas:
        if productoDestacado(ventas, elemento[0]):
            lista.append(elemento)
    return lista

#Apartado3
def tieneMayorIngreso(ventas, nombreProducto1, nombreProducto2):
    ingreso1 = calculaIngresos(ventas, nombreProducto1)
    ingreso2 = calculaIngresos(ventas, nombreProducto2)
    print(f"{nombreProducto1}: {ingreso1}, {nombreProducto2}: {ingreso2}")
    return ingreso1 > ingreso2

#Apartado4
def calcularIngresosTotales(ventas):
    total=0
    for producto in ventas:
        total+= producto[1]*producto[2]
    return total

# Programa principal
# Apartado 1
print(getProducto(ventas, "Monitor"))
print(calculaIngresos(ventas, "Monitor"))
# Apartado 2
print(productoDestacado(ventas, "Consola"))
print(productoDestacado(ventas, "Tablet"))
print(productoDestacado(ventas, "Tomate"))
# Apartado 2.1
print(getProductoDestacado(ventas))
# Apartado 3
print(tieneMayorIngreso(ventas, "Smartphone", "Auriculares"))
# Apartado 4
print(calcularIngresosTotales(ventas))