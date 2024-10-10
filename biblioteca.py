def par(n):
    if n % 2 == 0:
        print("O número é par")
def impar(m):
    if m % 2 != 0:
        print("O número é impar")

def imprime_nome(nome):
    print(f"Nome:{nome}")
#from biblioteca import par
#par(6)

def piramide(numero):
    for i in range(1, numero + 1):
        for x in range(i):
            print(i, end=" ")
        print()

def piramide2(num):
    for i in range(1,num+1):
        for x in range(1,i+1):
            print(x, end = " ")
        print()

def vogais(letras):
    cont=0
    t=len(letras)
    for x in range(t):
        if letras [x] in "aeiouAEIOU":
            cont+=1
    #print(f"encontramos {cont} vogais")
    return cont


def soma(n1,n2,n3,n4,n5):
    soma = n1+n2+n3+n4+n5
    print(soma)

def somar(*numeros):
    ta = len (numeros)
    soma=0
    for x in range(ta):
        soma += numeros[x]
    print(soma)

def contarletras(texto):
    cont=0
    for x in texto:
        if x not in " #$@!":
            cont+=1
    print (cont)
    ti=len(texto)
    for y in range (ti-1,-1,-1):
        print(texto[y], end=" ")

    #da 52 a 54
    #print(cont)
    #print(texto[::-1])
    #print(f"encontramos {cont} vogais")

def lista_Reversa(c):
    nova=[]
    for j in c:
        if j not in nova:
            nova.append(j)
        print(nova)

def primos(k):
    list=[]

def semrepeticao(l):
    l = [10,12,12,31,4,4,5,31,6,7,6,8]
    nlist = []
    for x in l:
        if x not in nlist:
            nlist.append(x)
    print(nlist)






