listaletra2=['x','y','z']
listaletra=['a','b','c']
listaletra3=listaletra+listaletra2
print("listaletras=", listaletra2)
print("listaletras2=",listaletra)
print("tamanho da lista 3=",len(listaletra3))
x=0
while x<len(listaletra3):
 print(listaletra3[x])
 x=x+1
listaletra3.append('@')
print("listaletra3 com @  =", listaletra3)
listaletra3[1]="E"
print("listaletra3[1] com B=", listaletra3)
