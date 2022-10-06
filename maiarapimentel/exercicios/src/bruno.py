from turtle import*
import turtle
bruno=turtle.Turtle()
bruno.shape("turtle")
bruno.color("yellow","blue")

passos=float(input("quantos passos?"))
lados=int(input("quantos lados?"))
angulo=float(input("angulo?"))

x=0
while x <= lados:
    begin_fill()
    bruno.fd(passos)
    bruno.left(angulo)

    x=x+1
else:
    end_fill()
    print("\nfim do while")

final=input("stf")



