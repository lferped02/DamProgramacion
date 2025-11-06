import turtle

def pintaLinea(color, largo, posicionX, posicionY, primeraVez):
    turtle.color(color)
    turtle.forward(200)#Mueve la torutga hacia adelante
    turtle.speed(5)
    
    turtle.pendown()
    if primeraVez:
        turtle.goto(posicionX, posicionY)
    turtle.penup()

for i in range(4):
    if i==0:
        primera = True
    else:
        primera = False
    
    pintaLinea("blue", 50,0,0)
    turtle.right(90)

turtle.hideturtle()#Oculta la tortuga de la pantalla
turtle.done()