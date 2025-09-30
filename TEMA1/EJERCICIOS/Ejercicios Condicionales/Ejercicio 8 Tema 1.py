puntuajeCredito = int (input ("Dame el credito: "))
ingresoAnual = int (input("Dame el ingreso anual: "))

if puntuajeCredito > 700 and ingresoAnual >= 60000:
    print("Elegible para el préstamo hipotecario")
else:
    print(" No elegible para el préstamo hipotecario")
print("FIN")