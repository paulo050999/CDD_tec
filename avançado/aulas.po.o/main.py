from biblioteca import *

p1 = Pessoa("João", 75, 21, gosta_de_videogame=True)
p2 = Pessoa("Luiza", 60, 19, gosta_de_videogame=False)
print(p1.nome, p1.idade, p1.peso)

print(p2)



p2.comer()
p2.estudar()
p2.parar_de_estudar()
p2.dormir()
p2.estudar()
p2.jogar_videogame()