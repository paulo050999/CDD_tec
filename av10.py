N=[""]*10
tamanho=len(N)
cont=0
for x in range (tamanho):
    N[x] = int(input("Digite o número: "))
n2 = int(input("Digite mais um número: "))
for z in range (tamanho):
    if n2 == N[z]:
        cont += 1
print (f"O número {n2} aparece {cont} vezes no vetor")