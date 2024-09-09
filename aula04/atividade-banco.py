class Client():
    def __init__(self, agency, account, nome) -> None:
        self.agency = agency
        self.account = account
        self.nome = nome
        self.balance = 0

    def deposit(self, value):
        if value < 0:
            value *= -1
        self.balance += value

    def withdraw(self, value):
        if value < 0:
            value *= -1
        self.balance -= value

    def get_balance(self):
        return self.balance
    
    @classmethod
    def main(cls):
        while True:
            print('\n 1 - Criar conta')
            print(' 2 - Depositar')
            print(' 3 - Sacar')
            print(' 4 - Consultar Saldo')
            print(' 5 - Sair')
            choice = int(input('\nEscolha uma opção: '))
            if choice == 1:
                agency = int(input('\nAgencia: '))
                account = int(input('Conta: '))
                name = input('Nome: ')
                client = cls(agency, account, name)
                print('Cliente adicionado!')
            elif choice == 2:
                if client:
                    value = float(input('\nDigite o valor do deposito: '))
                    client.deposit(value)
                else:
                    print('\nNão há cliente cadastrado!')
            elif choice == 3:
                if client:
                    value = float(input('\nDigite o valor para sacar: '))
                    client.withdraw(value)
                else:
                    print('\nNão há cliente cadastrado!')
            elif choice == 4:
                if client:
                    print(f'\nSeu saldo é de R$ {client.balance:.2f} !')
                else:
                    print('\nNão há cliente cadastrado!')
            elif choice == 5:
                print('\nSaindo...')
                print('Obrigado por usar o nosso sistema!')
                print('Até a próxima!\n')
                break
            else:
                print('\nOpção inválida... Tente novamente!')

if __name__ == '__main__':
    Client.main()
