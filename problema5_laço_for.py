#Faça um código que insira os números ímpares de 1 até o número escrito e diga que é ímpar
n = int(input("Digite o número: "))
for x in range (1,n+1):
    if x%2 == 1:
        print(f" {x} É UM NÚMERO IMPAR")
