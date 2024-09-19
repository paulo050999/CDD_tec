# Faça um algoritmo para receber um número qualquer e imprimir na tela se o núnmero é par ou ímpar , positivo ou negativo

numero=int(input("Primeiro numero"))
if numero%2==0:
    print("Número é par")
else:
    print("número impar")

if numero > 0:
    print("O número é positivo")
else:
    print("O número é negativo")

#numero=int(input("Primeiro numero"))
#if numero%2==0:
#    if numero > 0:
#        print("Número par positivo")
#    else:
#        print("Número par negativo")
#else:
#    if numero < 0:
#       print("número impar negativo")
#    else:
#       print("Número impar positivo")
