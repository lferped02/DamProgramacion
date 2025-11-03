nombreCompleto = input("Introduce tu nombre completo en minúsculas: ")
listaPalabras = nombreCompleto.split()
listaCapitalizada = []

for palabra in listaPalabras:
    palabraCap = palabra[0].upper() + palabra[1:]
    listaCapitalizada.append(palabraCap)
print(f"Lista con iniciales en mayúsculas {listaCapitalizada}: ")
