#Faça a tabuado de 1 a 10 do número digitado
num = int(input("Digite um número: "))
for t in range(1, 11):
    m = t * num
    print(f"{num} X {t} = {m}")