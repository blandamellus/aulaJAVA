listaletras=['a','b','c']
listaletras2=['x','y','z']
listaletras3=listaletras+listaletras2
print('listaletras3=',listaletras3)
print('tamanho da lista 3= ',len(listaletras3))
x=0
while x<len(listaletras3):
    print(listaletras3[x])
    x=x+1
listaletras3.append('@')
print('listaletras3 com @ =', listaletras3)
listaletras3[1]='E'
print('listaletras3[1] com E',listaletras3)
listaletras3