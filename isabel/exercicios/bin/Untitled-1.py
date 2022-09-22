from turtle import *
import turtle
caxopa=turtle.Turtle()
caxopa.shape("turtle")
caxopa.color("blue", "white")
passos=float(input("tamanho da linha"))
lados=int(input('quantos lados? '))
angulo=int(input("angulo? "))
x=0
while x <= lados :
    caxopa.fd(passos)
    caxopa.left(angulo)
    x=x+1
else:
    print('fim')
final=input('fim2')
