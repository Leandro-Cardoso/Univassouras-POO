class Porta:
    def __init__(self, cor, material):
        self.cor = cor
        self.material = material
        self.aberta = False
    
    @classmethod
    def criar_porta(cls):
        cor = str(input("Qual é a cor da porta: "))
        material = str(input("Qual é o material da porta: "))
        return cls(cor, material)
        
    def __str__(self):
            if not self.aberta:
                return f"A porta {self.cor} do material {self.material} está fechada!"
            else:
                return f"A porta {self.cor} do material {self.material} está aberta!"
        
class Chave:
    def __init__(self, cor , tipo):
        self.cor = cor
        self.tipo = tipo
        self.porta = None

    @classmethod
    def criar_chave(cls):
        cor = str(input("Cor da chave: "))
        tipo = str(input("Tipo da chave: "))
        return cls(cor, tipo)
    
    def abrir_a_porta(self, porta):
        self.porta = porta
        if not self.porta.aberta:
            self.porta.aberta = True
            print(f"A porta {self.porta.cor} está aberta")
        else:
            print(f"A porta {self.porta.cor} já estava aberta")

    def fechar_porta(self, porta):
        self.porta = porta
        if self.porta.aberta:
            self.porta.aberta = False
            print(f"A porta {self.porta.cor} foi fechada")
        else:
            print(f"A porta {self.porta.cor} já estava fechada")

porta1 = Porta.criar_porta()

print(porta1)

chave1 = Chave.criar_chave()

chave1.abrir_a_porta(porta1)

chave1.fechar_porta(porta1)
