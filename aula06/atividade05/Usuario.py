class Usuario:
    def __init__(self, nome, senha) -> None:
        self.senha = senha
        self.nome = nome
        self.isLogado = False

    @classmethod
    def criar_usuario_admin(cls):
        return cls('admin', 'admin')

    def logar(self):
        while True:
            nome = input('\n Nome: ')
            senha = input(' Senha: ')

            if nome == self.nome and senha == self.senha:
                self.isLogado = True
                print(f'\n Usuário {self.nome} logado...\n')
                break
            else:
                print('\n Usuário ou senha inválidos !!!')

if __name__ == '__main__':
    usuario_admin = Usuario.criar_usuario_admin()
    usuario_admin.logar()
