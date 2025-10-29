numero = input("Introduce un número: ")
inicio = int(input("Introduce un inicio: "))
final = int(input("Introduce un final: "))

if inicio < final and inicio < len(numero) and final < len(numero):
    print(numero[inicio:final + 1])
else:
    print("No se puede")
