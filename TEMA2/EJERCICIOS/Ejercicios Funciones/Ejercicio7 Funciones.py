def login():
    numeroIntento = 1
    while numeroIntento <= 3:
        usuario = input("Escribe el usuario: ")
        contraseña = input("Escribe una contraseña: ")

        if usuario == "usuario1" and contraseña == "asdasd":
            print("Acceso correcto")
            return True
        else:
            print("Usuario o contraseña incorrectos. Intento", numeroIntento)
            numeroIntento += 1

    print("Has superado el número máximo de intentos.")
    return False

# Ejecutar login
login()
