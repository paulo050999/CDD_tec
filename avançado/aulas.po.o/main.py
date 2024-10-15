from biblioteca import *

p1 = Pessoa("João", 75, 21, gosta_de_videogame=True)
p2 = Pessoa("Luiza", 60, 19, gosta_de_videogame=False)
print(p1.nome, p1.idade, p1.peso)

print(p2)



p2.comer()
p2.parar_de_comer()
p2.estudar()
p2.parar_de_estudar()
p2.andar()
p2.jogar_videogame()
p1.dormir()
p1.jogar_videogame()

g1 = Gato("Astolfo", "lilaz")
v1 = Vaca("Creuza", "mariscada")
c1 = Cachorro("Junin", "Caramelo")


print(g1.nome, g1.cor)
print(v1.nome, v1.cor)
print(c1.nome, c1.cor)
g1.comer()