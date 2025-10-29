numero = input("Introduce un número: ")
numdetras = int(input("¿Cuántos números quieres quitar por detrás?"))

longitud = len(numero)

if numdetras < longitud:
    substr = numero[0 : longitud - numdetras]
    print(substr)
else:
    print("No se puede quitar más dígitos de los que contiene el número")
