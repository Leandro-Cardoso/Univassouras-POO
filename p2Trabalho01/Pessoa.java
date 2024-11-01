public class Pessoa {
    String nome;
    double altura, peso;
    boolean relacao;

    public Pessoa (String nome, double altura, double peso) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.relacao = false;
    }

    public void ligarAutomovel(Automovel automovel) {
        automovel.ligar();
        this.relacao = true;
        System.out.println("\n " + this.nome + " ligou o(a) " + automovel.marca + ", " + automovel.modelo + "...\n");
    }

    public void desligarAutomovel(Automovel automovel) {
        automovel.desligar();
        this.relacao = false;
        System.out.println("\n " + this.nome + " desligou o(a) " + automovel.marca + ", " + automovel.modelo + "...\n");
    }
}
