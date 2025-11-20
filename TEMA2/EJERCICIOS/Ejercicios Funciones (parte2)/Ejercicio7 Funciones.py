def obtenerCadenaDeUsuario():
    cadena = input("Introduce varias cadenas separadas por comas: ")
    # Dividir la cadena por comas
    cadenaDividida = cadena.split(',')
    return cadenaDividida

def construirListaSinRepetidos(listaConDuplicados):
    listaSinDuplicados = []
    for elemento in listaConDuplicados:
        if elemento not in listaSinDuplicados:
            listaSinDuplicados.append(elemento)
    return listaSinDuplicados

def programaCadenaUnicaPrincipal():
    # Llamada correcta a la función
    listaOriginal = obtenerCadenaDeUsuario()
    listaUnica = construirListaSinRepetidos(listaOriginal)

    # Mostrar los resultados
    print(f"Lista original (con posibles duplicados): {listaOriginal}")
    print(f"Lista sin cadenas repetidas (usando bucles): {listaUnica}")

programaCadenaUnicaPrincipal()
