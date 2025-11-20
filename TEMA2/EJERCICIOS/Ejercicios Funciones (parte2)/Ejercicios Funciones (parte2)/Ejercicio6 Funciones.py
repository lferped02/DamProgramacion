def cargarLista():
    lista = []
    seguir = True
    while seguir:
        dato = input("Introduce un número (o cualquier otra cosa para salir): ")
        if dato.isdigit():
            lista.append(int(dato))
        else:
            seguir = False
    return lista

def estaOrdenada(lista, ascendente=True):
    i = 0
    while i < len(lista) - 1:
        if ascendente:  # comprobar ascendente
            if lista[i] > lista[i + 1]:
                return False
        else:  # comprobar descendente
            if lista[i] < lista[i + 1]:
                return False
        i += 1
    return True

def mostrarMenu():
    print("\n--- MENÚ ---")
    print("1. Cargar lista")
    print("2. Comprobar si está ordenada ascendentemente")
    print("3. Comprobar si está ordenada descendentemente")
    print("4. Salir")

def main():
    lista = []
    opcion = 0
    while opcion != 4:
        mostrarMenu()
        opcion = int(input("Elige una opción: "))
        
        if opcion == 1:
            lista = cargarLista()
            print("Lista cargada:", lista)
        elif opcion == 2:
            if estaOrdenada(lista, True):
                print("La lista está ordenada ascendentemente.")
            else:
                print("La lista NO está ordenada ascendentemente.")
        elif opcion == 3:
            if estaOrdenada(lista, False):
                print("La lista está ordenada descendentemente.")
            else:
                print("La lista NO está ordenada descendentemente.")
        elif opcion == 4:
            print("¡Hasta luego!")
        else:
            print("Opción no válida.")

# Ejecutar el programa
main()
