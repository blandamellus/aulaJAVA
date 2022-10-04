import turtle
pog=turtle.Turtle()
pog.shape('turtle')
pog.penup()
pog.setpos(-50,-100)
pog.pendown()
pog.color('white','purple')
pog.pensize(7)
pog.speed('fastest')

ws=turtle.Screen()
ws.bgcolor('black')

kekw=turtle.Turtle()
kekw.shape('turtle')
kekw.penup()
kekw.setpos(50,-100)
kekw.pendown()
kekw.color('white','blue')
kekw.pensize(7)
kekw.speed('fastest')

lol=turtle.Turtle()
lol.shape('turtle')
lol.penup()
lol.setpos(-50,0)
lol.pendown()
lol.color('white','gray')
lol.pensize(7)
lol.speed('fastest')


lul=turtle.Turtle()
lul.shape('turtle')
lul.penup()
lul.setpos(50,0)
lul.pendown()
lul.color('white','pink')
lul.pensize(7)
lul.speed('fastest')




x=1
pog.begin_fill()
kekw.begin_fill()
lol.begin_fill()
lul.begin_fill()
while x <=4:
    
    pog.circle(100)
    pog.left(90)
    kekw.circle(100)
    kekw.left(90)
    lol.circle(100)
    lol.left(90)
    lul.circle(100)
    lul.left(90)



    x+=1
pog.end_fill()
kekw.end_fill()
lol.end_fill()
lul.end_fill()




































fim=input(print('Fim'))
