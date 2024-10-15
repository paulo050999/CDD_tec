class Pessoa:

    def __init__(self, nome, peso, idade, gosta_de_videogame, comendo=False, dormindo=False, andando=False, estudando=False):
        self.nome = nome
        self.peso = peso
        self.idade = idade
        self.comendo = comendo
        self.gosta_de_videogame = gosta_de_videogame
        self.dormindo = dormindo
        self.andando = andando
        self.estudando = estudando

    def jogar_videogame(self):
        if self.gosta_de_videogame:
            print(f"{self.nome} está jogando videogame")
        else:
            print(f"{self.nome} não gosta de jogar videogame")

    def andar(self):
        if self.dormindo:
            print(f"{self.nome} não pode andar enquanto está dormindo")
        elif self.comendo:
            print(f"{self.nome} não pode andar enquanto está comendo")
        elif self.estudando:
            print(f"{self.nome} não pode dormir enquanto está estudando")
        elif self.andando:
            print(f"{self.nome} já está andando")
        else:
            print(f"{self.nome} começou a andar de cavalo com roda")
            self.andando = True

    def parar_de_andar(self):
        if self.andando:
            print(f"{self.nome} parou de andar")
            self.andando = False
        else:
            print(f"{self.nome} não está andando")

    def comer(self):
        if self.dormindo:
            print(f"{self.nome} não pode comer enquanto está dormindo")
        elif self.andando:
            print(f"{self.nome} não pode comer agora, pois não é muito recomendado comer andando")
        elif self.estudando:
            print(f"{self.nome} não pode dormir enquanto está estudando")
        elif self.comendo:
            print(f"{self.nome} já está comendo")
        else:
            print(f"{self.nome} vai começar a comer")
            self.comendo = True

    def parar_de_comer(self):
        if self.comendo:
            print(f"{self.nome} vai parar de comer")
            self.comendo = False
        else:
            print(f"{self.nome} não está comendo")

    def dormir(self):
        if self.comendo:
            print(f"{self.nome} não pode dormir enquanto está comendo")
        elif self.andando:
            print(f"{self.nome} não pode dormir enquanto está andando")
        elif self.estudando:
            print(f"{self.nome} não pode dormir enquanto está estudando")
        elif self.dormindo:
            print(f"{self.nome} já está dormindo")
        else:
            print(f"{self.nome} foi dormir")
            self.dormindo = True

    def acordar(self):
        if self.dormindo:
            print(f"{self.nome} acordou")
            self.dormindo = False
        else:
            print(f"{self.nome} não está dormindo")
    def estudar(self):
        if self.dormindo:
            print(f"{self.nome} não pode estudar enquanto está dormindo")
        elif self.comendo:
            print(f"{self.nome} não pode estudar enquanto está comendo, pois não da pra ter muito foco se comer enquanto estuda")
        elif self.andando:
            print(f"{self.nome} não pode estudar enquanto está andando")
        elif self.estudando:
            print(f"{self.nome} já está estudando")
        else:
            print(f"{self.nome} vai começar a estudar")
            self.estudando=True
    def parar_de_estudar(self):
        if self.estudando:
            print (f"{self.nome} parou de estudar")
            self.estudando=False
        else:
            print(f"{self.nome} não está estudando")
