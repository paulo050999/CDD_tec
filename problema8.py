nomesA = int(input("Número de alunos do 3°H"))
soman = 0
media = 0

for x in range (1, nomesA+1, 1):
        notaA =float(input("A nota do aluno é: "))
        soman=soman+notaA
media = soman / nomesA
print (media)


#alunos = int(input("Quantidade de alunos: "))
#for x in range(alunos):
#   nota = float(input("Digite a nota: "))
#   soma = soma + nota
#media = soma / alunos
#print (media)

