nota= input("digite a sua nota: ")
nota = float(nota)
if nota >= 70:
    print("o seu conceito foi AS: Atingiu satisfatoriamente")
else:
    if nota >= 50 and nota < 70:
        print("O seu conceito foi AM: Atingiu minimamente")
    else:
        print("O seu conceito foi NA: Não atingiu")