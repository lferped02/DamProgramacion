def calcularMax (num_lista):
    min - num_lista [0]

    for l in range (len (num_lista)):
        if num_lista [l] < max:
            max = num_lista [l]
    
    return max

def calcularMin (num_lista):
    min - num_lista [0]

    for l in range (len (num_lista)):
        if num_lista [l] < min:
            min = num_lista [l]
    
    return min

def calcularMaxMin (MinMax_lista):
    Max_calcular = calcularMax (MinMax_lista)
    Min_calcular = calcularMin (MinMax_lista)

    return [Max_calcular, Min_calcular]

nueva_lista = []
while len (nueva_lista) <=10:
    nuevo_numero = int (input ("dame un numero:"))
    nueva_lista.append (nuevo_numero)

print (calcularMaxMin (nueva_lista))