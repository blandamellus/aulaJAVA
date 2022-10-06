skatistas= []
notas= []

resposta= "S"

while resposta == "S":
    skatistas= input("nome do skatista: ")
    nota= float(input("nota: "))
    skatistas.append(skatistas)
    notas.append(nota)
    resposta= input("inserir mais um skatista? [S ou N]")

print(skatistas)
print(notas)

maior= 0
for i in range(len(notas)):
    if(notas[i] > notas[maior]):
        maior= i

print("o vencedor é:", skatistas[maior], "e sua nota foi:", notas[maior])


