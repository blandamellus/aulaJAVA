from turtle import*
import turtle
bruno=turtle.Turtle()
bruno.shape("turtle")
bruno.color("yellow","blue")

passos=float(input("quantos passos?"))
lados=int(input("quantos lados?"))
angulo=float(input("angulo?"))

for i in [1,2,3,4]:
    print (i,end=",") #imprimir: 1,2,3,4
print("\nsegundo if:")
for i in range(1,lados,1):
    bruno.fd(passos)
    bruno.left(angulo)

final=input("stf")
    