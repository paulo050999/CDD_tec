#Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valo-
#res, caso contrário deverá multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma
#variável C e imprimir seu valor na tela
C = 0
A = int(input("Insira o valor de A"))
B = int(input("Insira o valor de B"))

if A == B:
    C = A + B
    print (C)
else:
    C = A * B
    print (C)
