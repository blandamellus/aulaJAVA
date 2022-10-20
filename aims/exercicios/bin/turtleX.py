import turtle
t=turtle.Turtle()
t.color('red','yellow') # pen:red & fill:yellow
t.shapesize(1,1,5)
ws=turtle.screen() # sreen: tela
ws.bgcolor('black') # bgcolor: cor de fundo
x=1
t.begin_fill()
while x<=4:
    t.fd(100)
    t.right(90)
t.end_fill()
f=input('fim')