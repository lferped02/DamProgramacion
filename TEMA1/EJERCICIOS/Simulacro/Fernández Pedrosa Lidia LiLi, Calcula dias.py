dia = int (input ("Introduce el día: "))
mes = int (input ("Introduce el mes: "))
anio = int (input ("Introduce el año: "))

diasTotal = dia

for i in range(1, mes):
    match i:
        case 1 | 3 | 5 | 7 | 8 | 10 | 12:
            diasTotal += 31
        case 2:
            diasTotal += 28
        case 4 | 6 | 9 | 11:
            diasTotal += 30

print("Han pasado", diasTotal, "días desde el 1 de enero.")