matrizDeTemperatura = [[22,20,19,21],
                       [18,25,23,22],
                       [19,21,20,24],
                       [17,23,22,19],
                       [24,23,27,26]]
#Calcular la media
def calculaMedia(listaNumero):
    media=0
    for i in range(len(listaNumero)):
        media += listaNumero[i]
    media = media / len(listaNumero)
    return media

#Calcula la media de la fila
def calculaMediaFila(matriz):
    listaMedia=[]
    for fila in matriz:
        listaMedia.append(calculaMedia(fila))
    return listaMedia

#La media del hotel
def mediaHotel(matriz):
    listaMedias=[]
    for fila in matriz:
        listaMedias.append(calculaMedia(fila))
    return calculaMedia(listaMedias)

#Calcular la media de la columna
def calculaMediaColumna0(numeroColumna, matriz):
    listaHabitacion0 = []
    for i in range(len(matriz)):
        listaHabitacion0.append(matriz[i][numeroColumna]) 
    return calculaMedia(listaHabitacion0)  

#Calcular la media de la columna determinada
def calcularMediaColumnaDeterminada(columna, matriz):
    listaColumna = []
    for fila in matriz:
        listaColumna.append(fila[columna])
    return calculaMedia(listaColumna)

#Calcular la lista con las medias de las habitaciones
def calcularMediasPorHabitacion(matriz):
    listaMediasHabitaciones = []
    numColumnas = len(matriz[0])
    for c in range(numColumnas):
        listaMediasHabitaciones.append(calcularMediaColumnaDeterminada(c, matriz))
    return listaMediasHabitaciones

#Programa principal
print(f"Medias por planta: {calculaMediaFila(matrizDeTemperatura)}")
print(f"Temperatura media del hotel: {mediaHotel(matrizDeTemperatura)}")
print(f"Media de la columna 0: {calculaMediaColumna0(0, matrizDeTemperatura)}")
print(f"Media columna 0: {calcularMediaColumnaDeterminada(0, matrizDeTemperatura)}")
print(f"Media columna 1: {calcularMediaColumnaDeterminada(1, matrizDeTemperatura)}")
print(f"Media columna 2: {calcularMediaColumnaDeterminada(2, matrizDeTemperatura)}")
print(f"Media columna 3: {calcularMediaColumnaDeterminada(3, matrizDeTemperatura)}")
print(f"Medias por habitación: {calcularMediasPorHabitacion(matrizDeTemperatura)}")