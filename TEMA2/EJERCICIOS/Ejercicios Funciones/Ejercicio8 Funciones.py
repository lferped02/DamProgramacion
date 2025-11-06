def convertirSegundos(segundos):
    horas = int(segundos / 3600)
    minutos = int((segundos % 3600) / 60)
    segundosRestantes = segundos % 60
    return horas, minutos, segundosRestantes

segundos = int(input("Introduce el tiempo en segundos: "))
horas, minutos, segundosRestantes = convertirSegundos(segundos)

print("Horas:", horas)
print("Minutos:", minutos)
print("Segundos restantes:", segundosRestantes)
