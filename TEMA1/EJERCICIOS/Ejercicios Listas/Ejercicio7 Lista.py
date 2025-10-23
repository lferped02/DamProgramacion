mesesAnio = ["Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"]
temperatura = []

for mes in mesesAnio:
    temperaturaMes = int(input("Dime una temperatura: "))
    temperatura.append(temperaturaMes)

for i in range (12):
    print(mesesAnio[i], ":", temperatura[i] * "*",temperatura[i] )