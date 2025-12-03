usuarios = []

#Permitir el alta de los usuarios
def altaUsuario(nombre):
    usuario = [nombre, 0]
    usuarios.append(usuario)

#El usuario de nombre y puntuacion general
def consultaUsuario(nombre):
    encontrado = False
    i = 0
    while i < len(usuarios):
        if usuarios[i][0] == nombre:
            print(f"Nombre: {usuarios[i][0]}- Puntuación general: {usuarios[i][1]}")
            encontrado = True
        i += 1

    if not encontrado:
        print("Usuario no encontrado.")

#La prueba necesita el nombre de usuario y el de la prueba

#El listado de puntuaciones es de mayor a menor con los nombres de jugadores

# Programa principal
altaUsuario("Ana")
altaUsuario("Luis")

usuarios[0][1] = 250
usuarios[1][1] = 180

consultaUsuario("Ana")
consultaUsuario("Luis")
consultaUsuario("Pedro")
