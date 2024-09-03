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


