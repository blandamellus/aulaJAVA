import turtle
pog=turtle.Turtle()
pog.shape('turtle')
pog.penup
pog.setpos(0,100)
pog.pendown
pog.color('white','purple')
depressão=turtle.Screen()
depressão.bgcolor('black')
pog.speed('fastest')
escolha=int(input(print('Escolha 1 para quadrado, 2 para triangulo e 3 para circulo')))

if escolha == 3:
    pog.circle(100)
elif escolha == 2:
    pog.fd(100)
    pog.left(120)
    pog.fd(100)
    pog.left(120)
    pog.fd(100)
elif escolha == 1:
    pog.fd(100)
    pog.left(90)
    pog.fd(100)
    pog.left(90)
    pog.fd(100)
    pog.left(90)
    pog.fd(100)
else:
    print('se n botou um numero aceito, burro')
fim=input(print('acabo'))


