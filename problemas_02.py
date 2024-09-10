#FAÇA UM CÓDIGO QUE RECEBA AS 3 NOTAS DE UM ALUNO E VERIFIQUE SE ELE ESTÁ APROVADO OU REPROVADO. CONSIDERE QUE A MÉDIA DE APROVAÇÃO É 7,0

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

#n1 = float(input("Digite a primeira nota:"))
#n2 = float(input("Digite a segunda nota:"))
#n3 = float(input("Digite a terceira nota:"))

#media = (nota1+nota2+nota3)/3
#if media>=7:
    #print("Parabens! aluno aprovado, sua media foi: ", media)
#else:
    #print("OPS! aluno reprovado, sua media foi: ", media

#print("Calculo finalizado!")