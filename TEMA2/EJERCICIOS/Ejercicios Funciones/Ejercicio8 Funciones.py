tiempo_segundo = ""
def convertirsegundo (segundos):
    horas = int (segundos / 3600)
    minutos = int((segundos % 3600) / 60)
    segundos_restantes = segundos % 60
    return horas, minutos, segundos_restantes

segundos = int (input ("dame el tiempo en segundos:"))
resultado = convertirsegundo (segundos)
print ("horas.", resultado [0])
print ("minutos", resultado [1])
print ("segundo_restantes", resultado [2])