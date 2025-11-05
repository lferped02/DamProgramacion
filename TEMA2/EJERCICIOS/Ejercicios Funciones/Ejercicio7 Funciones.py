def login (usuario, contraseña, num_intento):
    correcto = True
    while num_intento <=3 and correcto:
        if usuario == "usuario1" and contraseña == "asdasd":
            correcto = True
            num_intento = 4
        else:
            correcto = False
        num_intento +=1
        usuario = input ("escribe el usuario:")
        contraseña = input ("escribe una contraseña:") 
    return [correcto, num_intento]

usuario = input ("escribe un usuario:")
contraseña = input ("escribe una contraseña:")
num_intento = 1
acceso = login (usuario, contraseña, num_intento)
print (acceso [1])
