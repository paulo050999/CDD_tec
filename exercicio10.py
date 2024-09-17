media = 0
av1 = float(input("Escreva a primeira avaliação"))
while 0 >= av1 or av1 > 10:
    av1 = float(input("Digite a nota correta"))


av2 = float(input("Escreva a segunda avaliação"))
while  0 >= av2 or av2 > 10:
    av2 = float(input("Digite a nota correta"))

media = (av1 + av2) /2

print (f"sua média é {media}")



