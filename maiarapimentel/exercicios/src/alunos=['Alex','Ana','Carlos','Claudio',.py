alunos=['Alex','Ana','Carlos','Claudio','marta']
notas=[7,8,9,10,6]
x=1
for i in range (0,len(alunos)):
    print(alunos[i],'[',i,']=',notas[i]," ", end=" ")

excluir=int(input('\nqual posição voce quer eliminar?'))
print('voce quer remover',alunos[excluir],"nota",notas[excluir])
alunos.remove(alunos[excluir])
notas.remove(notas[excluir])
#
incluirne=input("\nqual aluno voce deseja incluir?")
incluirna=int(input("qual nota voce deseja incluir?"))
incluirpa=int(input("em que posição voce deseja incluir?"))
alunos.insert(incluirpa ,incluirne)
notas.insert(incluirpa,incluirna)
for i in range (0,len(alunos)):
    print(alunos[i],'[',i,']=',notas[i]," ", end=" ")
#
trocaral=int(input("\nqual posição voce deseja trocar?"))
colocar=input("qual aluno voce deseja colocar no lugar?")
print('qual nota o aluno',colocar,'tirou?')
colocarr=input('')
alunos.remove(alunos[trocaral])
notas.remove(notas[trocaral])
alunos.insert(trocaral,colocar)
notas.insert(trocaral,colocarr)
for i in range (0,len(alunos)):
    print(alunos[i],'[',i,']=',notas[i]," ", end=" ")