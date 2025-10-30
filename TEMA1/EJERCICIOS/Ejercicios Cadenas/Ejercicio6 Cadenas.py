numero = input("Introduce un número: ")
numeroDetras = int(input("¿Cuántos números quieres quitar por detrás?"))

longitud = len(numero)

if numeroDetras < longitud:
    substr = numero[0 : longitud - numeroDetras]
    print(substr)
else:
    print("No se puede quitar más dígitos de los que contiene el número")
