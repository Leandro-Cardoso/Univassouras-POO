package atividade05;

import java.util.Scanner;

public class Usuario {
    String senha;
    String nome;
    boolean isLogado;

    public Usuario() {
        this.senha = "admin";
        this.nome = "admin";
        this.isLogado = false;
    }

    public void logar() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\n Nome: ");
            String nome = scanner.nextLine();

            System.out.print("\n Senha: ");
            String senha = scanner.nextLine();
            
            if (nome.equals(this.nome) && senha.equals(this.senha)) {
                this.isLogado = true;
                System.out.println("\n Usuário " + this.nome + " logado...\n");
                break;
            }
            else {
                System.out.println("\n Usuário ou senha inválidos !!!");
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.logar();
    }
}
