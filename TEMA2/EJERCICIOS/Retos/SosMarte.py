def obtenerRecursos():    
    matriz = []
    numero = int(input("¿Cuántas entradas nuevas quieres añadir? "))
    for i in range(numero):
        nombre = input("Introduce el nombre del recurso: ")
        cantidad = int(input("Introduce la cantidad: "))
        nivelCritico = int(input("Introduce el nivel crítico: "))
        matriz.append([nombre, cantidad, nivelCritico])
    return matriz

def obtenerNombreRecurso(mensaje):
    partes = mensaje.split("::")
    nombre = ""
    if len(partes) >= 2:
        nombre = partes[1]
    return nombre

def leerBaseDatos(nombre, matriz):
    resultado = "-1"
    encontrado = False
    i = 0
    while i < len(matriz) and not encontrado:
        if matriz[i][0].lower() == nombre.lower():
            recurso = matriz[i]
            resultado = f"{recurso[0]}:{recurso[1]}:{recurso[2]}"
            encontrado = True
        else:
            i=i+1
    return resultado

def extraerDatos(mensaje, matriz):
    nombreBuscar = obtenerNombreRecurso(mensaje)
    return leerBaseDatos(nombreBuscar, matriz)

#BaseDatos = obtenerRecursos()
BaseDatos = [["Oxigeno", 100, 20],
             ["Agua", 50, 10],
             ["Comida", 30, 5]]

mensajeSatelite = "ERR_SISTEMA::Agua::-15++FIN"
resultado = extraerDatos(mensajeSatelite, BaseDatos)

print(f"Resultado final: {resultado}")