package atividade03;

public class Alimento {
    String nome;
    String tipo;
    String estado;

    public Alimento(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.estado = "verde";
    }

    public String apresentacao() {
        return "\n Nome: " + this.nome + "\n Tipo: " + this.tipo + "\n Estado: " + this.estado + "\n";
    }

    public void amadurecer() {
        this.estado = "maduro";
    }

    public void apodrecer() {
        this.estado = "podre";
    }

    public static void main(String[] args) {
        Alimento alimento = new Alimento("morango", "fruta");

        System.out.println(alimento.apresentacao());

        System.out.println(" O alimento começa " + alimento.estado + ".");
        alimento.amadurecer();
        System.out.println(" O alimento está " + alimento.estado + "...");
        alimento.apodrecer();
        System.out.println(" O alimento está " + alimento.estado + "...\n");
    }
}
