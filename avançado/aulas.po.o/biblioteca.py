class Pessoa:

    def __init__(self,nome,peso,idade, comendo = False):
        self.nome=nome
        self.peso=peso
        self.idade=idade
        self.comendo=comendo
    def andar (self):
        print(f"{self.nome} Foi andar de cavalo com roda")
    def comer(self):
        if self.comendo == True:
            print ("Já estou comendo")
        else:
            print ("Vou comer")
            self.comendo = True
    def dormir(self):
        print(f"{self.nome} foi dormir")
    def comendo(self):
        print(f"{self.nome} Estou comendo")
    def pararDeComer(self):
        if self.comendo == True:
            print ("Vou parar de comer")
        else:
            print ("Não estou comendo")
            self.comendo = False