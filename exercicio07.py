#ALTERAR O CÓDIGO DO PROBLEMA2 E ACRESCENTAR A OPÇÃO DE ALUNO EM RECUPERAÇÃO, CASO SUA MÉDIA SEJA MENOR QUE 7,0 E MAIOR QUE 4,0
n1 = float(input("Insira a nota 1:"))
n2 = float(input("Insira a nota 2:"))
n3 = float(input("Insira a nota 3:"))

notaMedia = (n1 + n2 + n3) / 3

if notaMedia >= 7:
    print (notaMedia, "Você está aprovado")

elif notaMedia >= 4:
    print (notaMedia, "Você está em recuperação" )
else:
    print (notaMedia, "Você está reprovado")

#RESOLUÇÃO DO PROF
#nota1=float(input("Digite a primeira nota: "))
#nota2=float(input("Digite a segunda nota: "))
#nota3=float(input("Digite a terceira nota: "))

#Media = (nota1 + nota2 + nota3) / 3

#if Media >= 7:
    #print ("Parabens! aluno aprovado, sua media foi: ", media)

#elif media >= 4:
    #print ("UFA! Foi por pouco, aluno em recuperação, sua media foi:", media)
#else:
    #print ("OPS! aluno reprovado, sua media foi: ", media)
#print("Calculo finalizado")


