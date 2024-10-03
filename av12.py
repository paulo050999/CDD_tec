numeros=[""]*3
tamanho=len(numeros)
cont=0
media=0
soma=0
maior=0
valor=0
menor=100000000000000000000000000000000
for x in range(tamanho):
    numeros[x]=int(input("Digite o número: "))
for z in range (tamanho):
    if numeros[z]%2==0:
        print (f"O número {numeros[z]} é par")
for y in numeros:
    if y>maior:
        maior=y
    if y<menor:
        menor=y
print(menor)
print(maior)

