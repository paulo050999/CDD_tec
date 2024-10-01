arraynotas=[0.0]*5
tam=len(arraynotas)
soma=0
cont=0
for i in range (tam):
    arraynotas[i] = float(input("Digite a nota de um aluno: "))

for x in range(tam):
    soma = soma + arraynotas [x]
media=soma/tam
for z in range (tam):
    if arraynotas[z]>media:
        cont=cont+1
print(f"A media da turma é {media} e "
      f"{cont} alunos tiveram uma nota maior que a média")