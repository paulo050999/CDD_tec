from biblioteca  import *

while True:
    opcao = int(input("Digite sua opção\n"
                      "1 para Gravar\n"
                      "2 para ler\n"
                      "3 para pesquisar\n"
                      "4 para sair\n"))
    match opcao:
        case 1:
            gravarArquivo(input("Digite o texto: "))
        case 2:
            lerArquivo()
        case 3:
            pass #...
        case 4:
            break
        case _:
            print("Opção inválida!")





