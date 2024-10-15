h1 = int(input("digite a primeira hora: "))
minuto1 = int(input("digite o seu primeiro minuto: "))
h2 = int(input("digite a sua segunda hora: "))
minuto2 = int(input("digite o seu segundo minuto: "))

if h1 > 12:
    h1 = h1 -12
if h2 >12:
    h2 = h2 = 12
somah = h1 + h2
if somah > 12:
    somam = minuto1 + minuto2
if somam >=60:
    somam=somam-60
    somah = somah +1
if somah>12:
    somah-=12
print (f"{somah}:{somam:2d}")
