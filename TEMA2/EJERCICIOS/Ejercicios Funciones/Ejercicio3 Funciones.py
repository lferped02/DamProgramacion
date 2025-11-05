def convertirespaciado (cadena):
    cadenaresultado = ""
    for c in cadena:
        if c != '':
            cadenaresultado = cadenaresultado +c+ ""
    return cadenaresultado

print (convertirespaciado ("Hola, tú"))