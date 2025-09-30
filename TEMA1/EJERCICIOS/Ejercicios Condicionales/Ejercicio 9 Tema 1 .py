respuestaHistorial = input("¿Historial crediticio negativo? (Si/No): ").strip().lower()
diasEmpleo = int(input("¿Cuántos días lleva en su empleo?: "))
sueldoAnual = float(input("¿Cuál es su sueldo anual?: "))
cantidadSolicitada = float(input("¿Cuánto solicita?: "))

historialNegativo = respuestaHistorial == "si"
empleoInestable = diasEmpleo < 730  
solicitudAlta = cantidadSolicitada > 0.01 * sueldoAnual

if historialNegativo or empleoInestable or solicitudAlta:
    print("Es de riesgo")
else:
    print("No es de riesgo")
