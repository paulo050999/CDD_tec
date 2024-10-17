with open("NomesturmaC.txt", "a") as arquivo:
    nome = input("Digite um nome:")
    arquivo.write(f"{nome}\n")

with open("NomesturmaC.txt", "r") as arquivo2:
    print(arquivo2.read())