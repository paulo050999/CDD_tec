#Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B e
#mostre se a soma é menor que c.

A = int(input("Insira o valor de A: "))
B = int(input("Insira o valor de B: "))
C = int(input("Insira o valor de C: "))

soma = (A+B)

while soma < C:
    print(f"Soma é igual a {soma}")
    print("Soma é menor que C")
    break
if soma > C:
    print ("Soma é maior a C")

elif soma == C:
    print ("Soma é igual a C")





