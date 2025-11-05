def calcularMax (num_lista):
    max = -9999999999
    for l in range (len (num_lista)-1):
        if num_lista [l] > max:
            max = num_lista [l]
    return max

lista = []
while len (lista) <=10:
    num = int (input("dame numeros"))
    lista.append (num)

print (calcularMax (lista))