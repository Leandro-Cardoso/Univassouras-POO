class Pessoa():
    def __init__(self, origem, idade, genero, cor, profissao) -> None:
        self.origem = origem
        self.idade = idade
        self.genero = genero
        self.cor = cor
        self. profissao = profissao
        
    def __str__(self) -> str:
        return f'\n Origem: {self.origem}\n Idade: {self.idade}\n Genero: {self.genero}\n Cor: {self.cor}\n Profissão: {self.profissao}\n'

pessoa = Pessoa('humilde', 35, 'masculino', 'branco', 'Desenvolvedor')
print(pessoa)
