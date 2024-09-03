lv = float(input("Quantos litros você colocou? "))
tipo = str(input("G = Gasolina, E = etanol"))

if tipo == "g" or "G":
    valor = 5.90
elif tipo == "e" or "E":
    valor = 4.90
total = lv * valor
print (f"O usuário terá que pagar {total}")











