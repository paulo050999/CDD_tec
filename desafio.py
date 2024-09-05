# dados os valores de horários abaixo, decifre a lógica e faça um código para executar.

# entrada1:  3:45
# entrada2: 14:20

# saída 6:05
h1 = int(input("Digite a hora 1: "))
m1 = int(input("Digite o minuto 1: "))

if 0 <= h1 <= 24 and 0 <= m1 <60:

  h2 = int(input("Digite a hora 2: "))
  m2 = int(input("Digite o minuto 1: "))

  if 0 <= h2 <= 24 and 0 <= m2 < 60:

    if h2 > 12:
        h2 -= 12
    if h1 > 12:
        h1 -= 12

    somamin = m1 + m2
    somahor = (h1 + h2)

    if somamin >= 60:
        somamin -= 60
        somahor +=1

    if somahor > 12:
        somahor +=12

    if somahor > 24:
        somahor -=24

    print (f"A saída é {somahor:02d}: {somamin:02d}")

else:
     print("Hora ou minutos da segunda entrada inválidos")
else:
print("Hora ou minutos da primeira entrada inválidos")



# if 0 <= hora1 <= 24 and 0 <= minuto1 <60;



