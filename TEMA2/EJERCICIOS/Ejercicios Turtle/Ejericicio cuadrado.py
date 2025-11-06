import turtle

def pintaCuadrado(color, lado, x, y):
    turtle.penup()
    turtle.goto(x, y)
    turtle.pendown()
    turtle.color(color)
    for _ in range(4):
        turtle.forward(lado)
        turtle.right(90)

# Dibujar dos cuadrados
pintaCuadrado("blue", 100, 0, 0)
pintaCuadrado("green", 100, 200, 200)

turtle.hideturtle()
turtle.done()
