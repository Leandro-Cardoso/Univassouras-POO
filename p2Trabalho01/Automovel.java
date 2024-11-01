public class Automovel {
    String marca, modelo, cor;
    boolean movimento;
    int ano;
    double velocidade;

    public Automovel (String marca, String modelo, String cor, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.movimento = false;
        this.velocidade = 0;
    }

    public void ligar() {
        this.movimento = true;
        System.out.println("\n O veiculo está ligado...\n");
    }

    public void desligar() {
        this.movimento = false;
        this.velocidade = 0;

        System.out.println("\n O veiculo está desligado...\n");
    }
}
