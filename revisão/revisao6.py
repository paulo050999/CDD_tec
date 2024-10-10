#IMC
#IMC = peso/altura**2
altura = float (input("Digite sua altura"))
peso = float (input("Digite seu peso"))
IMC = peso / (altura*altura)
print (f"Seu IMC é {IMC}")

if IMC <= 18.5:
    print ("Você está abaixo do peso")
elif IMC > 18.5 and IMC <=24.9:
    print ("Você está no peso ideal(parabéns")
elif IMC > 24.9 and IMC <= 29.9:
    print ("Você está levemente acima do peso")
elif IMC > 29.9 and IMC <= 34.9:
    print ("Você está com obesidade grau 1")
elif IMC > 34.9 and IMC <= 39.9:
    print ("obeseidade grau 2 (Severa)")
else:
    print ("Obesidade grau 3 (mórbida)")

