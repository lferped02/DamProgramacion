#Apartado1
totalIncidentes = 0
leves = 0
graves = 0
eso = 0
postObligatoria = 0

registrando = True

while registrando:
    respuesta = input("¿Desea registrar un nuevo incidente? S (Sí) / N (No): ").upper()

    if respuesta == "N":
        registrando = False

    elif respuesta == "S":
        nivel = ""
        while nivel not in ["E", "P"]:
            nivel = input("¿En qué nivel ha ocurrido? E (ESO) / P (Post-Obligatoria): ").upper()

        tipo = ""
        while tipo not in ["L", "G"]:
            tipo = input("¿Qué tipo de incidente ha ocurrido? L (Leve) / G (Grave): ").upper()

        totalIncidentes = totalIncidentes + 1

        if tipo == "L":
            leves = leves + 1
        else:
            graves = graves + 1

        if nivel == "E":
            eso = eso + 1
        else:
            postObligatoria = postObligatoria + 1

    else:
        print("Respuesta no válida. Por favor, introduce S o N.")

print("Incidentes registrados.")

#Apartado2
if totalIncidentes > 0:
    porcentajeEso = (eso * 100) / totalIncidentes
    porcentajePost = (postObligatoria * 100) / totalIncidentes

    print()
    print("Se han producido", totalIncidentes, "incidentes en el centro:",
          leves, "de ellos Leves y", graves, "Graves,", end=" ")
    print("Siendo el", int(porcentajeEso), "% en ESO y el", int(porcentajePost), "% en Post-Obligatoria.")
else:
    print()
    print("No se han registrado incidentes.")
