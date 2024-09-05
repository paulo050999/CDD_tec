nome = input("Digite o seu nome: ")
idade = int(input("Digite sua idade: "))
salario = float(input("Digite seu salário: "))
novoSalario = salario*1.1
meses = idade*12

print(f"Seu nome é {nome}, "
      f"Você tem {idade} anos, já viveu {meses}"
      f",  e recebe {salario} e seu salário com mais 10% é {novoSalario:,.2f}")

# caracteres depois do ponto == {novoSalario:.2f} o número é equivalente a quantidade de casas

