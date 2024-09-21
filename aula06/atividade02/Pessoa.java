package atividade02;

public class Pessoa {
    String origem;
    int idade;
    String genero;
    String cor;
    String profissao;

    public Pessoa(String origem, int idade, String genero, String cor, String profissao) {
        this.origem = origem;
        this.idade = idade;
        this.genero = genero;
        this.cor = cor;
        this.profissao = profissao;
    }

    public String apresentacao() {
        return "\n Origem: " + this.origem + "\n Idade: " + this.idade + "\n Genero: " + this.genero + "\n Cor: " + this.cor + "\n Profissão: " + this.profissao + "\n";
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("pobre", 35, "masculino", "branco", "desenvolvedor");

        System.out.println(pessoa.apresentacao());
    }
}
