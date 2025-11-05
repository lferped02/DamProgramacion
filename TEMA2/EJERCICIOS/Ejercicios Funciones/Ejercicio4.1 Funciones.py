def calcularMin (num_lista):
    min = 9999
    for l in range (len (num_lista)-1,-1,-1):
        if num_lista [l] < min:
            min = num_lista [l]
    return min

lista = []
while len (lista) <=10:
    num = int (input("dame numeros"))
    lista.append (num)

print (calcularMin (lista))