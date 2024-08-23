class Carro:
    def __init__(self, marca, modelo, ano, cor, cambio):
        '''Descrição da classe carro.'''
        self.marca = marca
        self.modelo = modelo
        self.ano = ano
        self.cor = cor
        self.cambio = cambio
        self.isMoving = False
        self.velocidade = 0.0
    
    def __str__(self):
        return f'\n\tCarro: {self.marca}, {self.modelo}, {self.ano}, {self.cor}, {self.cambio}\n'
    
    def start(self):
        if not self.isMoving:
            print(f'\nO {self.marca} {self.modelo} está parado e ligado...\n')

    def acelerar(self, aceleracao):
        if self.isMoving:
            self.velocidade += aceleracao
            print(f'O {self.marca} {self.modelo} está movendo a {self.velocidade:.0f} km/h...')
        else:
            self.isMoving = True
            self.velocidade = aceleracao
            print(f'O {self.marca} {self.modelo} foi acelerado a {aceleracao} e está movendo a {self.velocidade:.0f} km/h...')

    def desligar(self):
        if self.isMoving:
            self.isMoving = False
            self.velocidade = 0
        print(f'O {self.marca} {self.modelo} está desligado...')
    
class Moto():
    def __init__(self, marca, modelo, ano, cor, cilindrada):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano
        self.cor = cor
        self.cilindrada = cilindrada
    
    def __str__(self):
        return f'\n\tCarro: {self.marca}, {self.modelo}, {self.ano}, {self.cor}, {self.cilindrada}\n'
