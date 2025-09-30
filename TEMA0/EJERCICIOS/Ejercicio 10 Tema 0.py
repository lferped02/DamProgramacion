# Solicitar los tres números al usuario
a = float(input("Introduce el primer número: "))
b = float(input("Introduce el segundo número: "))
c = float(input("Introduce el tercer número: "))

# Comparaciones para encontrar el mayor
if a > b:
    if a > c:
        print("El número mayor es A:", a)
    else:
        print("El número mayor es C:", c)
else:
    if b > c:
        print("El número mayor es B:", b)
    else:
        print("El número mayor es C:", c)
