public class Moto extends Automovel {
    char marcha;

    public Moto (String marca, String modelo, String cor, int ano) {
        super(marca, modelo, cor, ano);
        this.marcha = 'N';
    }

    public void acelerar(double aceleracao) {
        if (this.movimento) {
            if (this.marcha == 'N' || this.marcha == 'n') {
                System.out.println("\n Não é possivel acelerar com o cambio no neutro !!!\n");
            }
            else if (this.marcha == 'R' || this.marcha == 'r') {
                this.velocidade -= aceleracao;
                System.out.println("\n Acelerou para trás: " + aceleracao + " Velocidade: " + this.velocidade + "\n");
            }
            else {
                this.velocidade += aceleracao;
                System.out.println("\n Acelerou: " + aceleracao + " Velocidade: " + this.velocidade + "\n");
            }
        }
        else {
            System.out.println("\n Não é possivel acelerar com a moto desligada !!!\n");
        }
    }

    public void passarMarcha(char marcha) {
        this.marcha = marcha;
        System.out.println("\n A moto mudou para a marcha " + marcha + ".\n");
    }
}
