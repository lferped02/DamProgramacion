import random
#1. Menú principal
print("-----------------------------------")
print ("SOMBRERO SELECCIONADOR")
print ("1. Seleccionar casa para un alumno")
print ("2. Mostrar estadisticas")
print ("Elige una opcion. Si quieres salir del programa, escrive la opcion 1 y el nombre del personaje innombrable")
print("-----------------------------------")
casa = (input ("Selecciona una casa para el alumno (1-4): "))
if casa:
    print ("Ejecuta y selecciona la casa")
else: 
    print ("Opcion valida")
#2. Opcion Menú1 -Seleccionar cada para un alumno
#3. Repetir menú y salida
nombreAlumno = (input ("Dime el nombre del alumno: "))

gryffindor = 1
slytherin = 2
hufflepuff = 3
ravenclaw = 4

sombrero = random.randint(1, 4)
if nombreAlumno :
    print ("Es Voldemort")
    match sombrero:
     case 1:
        print(f"El sombero dice que {nombreAlumno} pertenece a {casa}")
        match sombrero:
            case 2: 
                print(f"El sombero dice que {nombreAlumno} pertenece a {casa}")
        match sombrero: 
            case 3:
                print(f"El sombero dice que {nombreAlumno} pertenece a {casa}")
        match sombrero:
            case 4:
                print(f"El sombero dice que {nombreAlumno} pertenece a {casa}")
            case _:
                print(f"El sombero dice que {nombreAlumno} pertenece a {casa}")
         
else:
    print ("Appaparation, transportame a otro sitio")

#4.Opcion Menu mostrar y calcular estadisticas
totalAlumno = input("Dime el totaol de los alumnos: ")
numero = int (input ("Dime el numero de la puntuacion"))

nombreAlumno += totalAlumno
gryffindor+= numero
slytherin+=numero
hufflepuff+=numero
ravenclaw+=numero