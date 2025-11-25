matrizDeTemperatura=[[22,20,19,21],
                     [18,25,23,22],
                     [19,21,20,24],
                     [17,23,22,19],
                     [24,23,27,26]]

#Calcular la lista de numero
def calculaMedia(listaNumero):
    media=0
    for i in range(len(listaNumero)):
        media+=listaNumero[i]#Acumulamos cada número
    media=media/len(listaNumero)
    return media

#Calcular la media de la fila
def calculaMediaFila(matriz):
    listaMedia=[]
    for fila in matriz:
        listaMedia.append(calculaMedia(fila))
    return listaMedia

#Programa principal
listaNumero=[22,20,19,21]
#Resultado de la media
resultado=calculaMedia(listaNumero)
print(resultado)
#Resultado de la media de la fila
print(calculaMediaFila(matrizDeTemperatura))