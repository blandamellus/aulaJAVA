import turtle


class telhado:
    def sobedesce(self,x,y,base):
        lado=base/2
        hipo=lado/0.259
        import turtle
        p=turtle.Turtle()
        p.left(75)
        p.fd(hipo)
        p.right(150)
        p.fd(hipo)


class paredes():
    def faz3paredes(self,x,y,lado2,base2):
        import turtle
        p=turtle.Turtle()
        p.penup()
        p.setpos(x,y)
        p.pendown()
        p.right(90)
        p.fd(lado2)
        p.left(90)
        p.fd(base2)
        p.left(90)
        p.fd(lado2)

telha1=telhado()
telha1.sobedesce(0,0,50)
telha1.sobedesce(50,0,100)
telha1.sobedesce(150,0,50)
wall=paredes()
wall.faz3paredes(0,0,200,200)


input()