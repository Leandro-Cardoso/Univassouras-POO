class Pessoa:
    def __init__(self, nome, altura, email, cpf, telefone, endereco):
        self.nome = nome
        self.altura = altura
        self.email = email
        self.cpf = cpf
        self.telefone = telefone
        self.endereco = endereco
        self.objeto = "Humnao"

    def agradar_o_outro(self):
        var = input("Fale algo agradavel")
        if var == "Oi" or var == "oi":
            print(f"{self.nome} disse que você esta muito bem hoje fulano")
        else:
            print("Não é uma frase definida!")
    
    def desagradar_o_outro(self):
        var = input("Fale algo desagradavel")
        if var == "Não" or var == "não":
            print(f"{self.nome} disse que você não esta bem hoje fulano")
        else:
            print("Não é uma frase definida!")
