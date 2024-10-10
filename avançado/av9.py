N=[""]*5
tamanho=len(N)
S=[""]*5

for x in range (tamanho):
    N[x] = input("Digite o nome do usúario: ")
    S[x] = int(input("Digite a Senha: "))
for z in range (tamanho):
    print (f"A posição do uúario é {z}, o nome do usuário é {N[z]}, a senha do usuário é {S[z]}")

