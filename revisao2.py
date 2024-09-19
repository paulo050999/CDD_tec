# Acrescente no exercício anterior, a opção de verificar o número.

opcao = 1
while opcao == 1:

    numero=int(input("Primeiro numero"))
    if numero%2==0:
        print("Número é par")
    else:
        print("número impar")

    if numero > 0:
        print("O número é positivo")
    else:
        print("O número é negativo")
    opcao = int(input("Deseja continuar? \n"
                      "Digite 1 para colocar um novo número \n]"
                      "Digite 2 para parar"))


