def gravarArquivo (t):
    with open("NomesturmaC.txt", "a") as arquivo:
        arquivo.write(f"{t}\n")

def lerArquivo():
    with open("NomesturmaC.txt", "r") as arquivo2:
        print(arquivo2.read())
def pesquisar(texto):
    cont=0
    with open("NomesturmaC.txt", "r") as pesq:
        for x in pesq:
            if texto in x:
                cont+=1
            print(f"Achei {cont} ocorrencia de {texto} no arquivo")