N = []
S = []
opcao = 0
while opcao != 3:
    print("\nSistema de Login:")
    print("1. Criar novo usuário")
    print("2. Login")
    print("3. Sair")
    opcao = int(input("Escolha uma opção (1, 2 ou 3): "))
    if opcao == 1:
        nome = input("Digite o nome do novo usuário: ")
        senha = int(input(f"Digite a senha para o usuário {nome}: "))
        N.append(nome)
        S.append(senha)
        print(f"Usuário {nome} cadastrado com sucesso!")
    elif opcao == 2:
        nome = input("Digite o nome de usuário: ")
        senha = int(input("Digite a senha: "))
        if nome in N:
            indice = N.index(nome)
            if S[indice] == senha:
                print(f"Login efetuado com sucesso! Bem-vindo, {nome}.")
            else:
                print("Senha incorreta!")
        else:
            print("Usuário não encontrado!")
    elif opcao == 3:
        print("Saindo do sistema...")

    else:
        print("Opção inválida, tente novamente.")
