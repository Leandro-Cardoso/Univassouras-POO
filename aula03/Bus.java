public class Bus {
    String marca;
    String modelo;
    int ano;
    String placa;
    int eixos;
    boolean isOn;
    int velocidade;
    public Bus(String marca, String modelo, int ano, String placa, int eixos) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.eixos = eixos;
        this.isOn = false;
        this.velocidade = 0;
    }
    public void ligar() {
        if(!isOn) {
            isOn = true;
            System.out.println("O onibus foi ligado...");
        }
        else {
            System.out.println("O onibus está ligado...");
        }
    }
    public void desligar() {
        if(isOn) {
            isOn = false;
            System.out.println("O onibus foi desligado...");
        }
        else {
            System.out.println("O onibus está desligado...");
        }
    }
    public void acelerar(int vel) {
        if(isOn) {
            velocidade += vel;
            System.out.println("O onibus acelerou para " + velocidade + " Km/h");
        }
    }
    public void frear(int vel) {
        if(isOn) {
            if(velocidade - vel >= 0) {
                velocidade -= vel;
            }
            else {
                velocidade = 0;
            }
            System.out.println("O onibus freiou para " + velocidade + " Km/h");
        }
    }
    public static void main(String[] args) {
        Bus buzao = new Bus("Mercedes", "Não sei", 1995, "LLC-2510", 2);
        System.out.println();
        System.out.println("Marca: " + buzao.marca);
        System.out.println("Modelo: " + buzao.modelo);
        System.out.println("Ano: " + buzao.ano);
        System.out.println("Placa: " + buzao.placa);
        System.out.println("Eixos: " + buzao.eixos);
        System.out.println();
        buzao.ligar();
        buzao.acelerar(50);
        buzao.acelerar(50);
        buzao.frear(30);
        buzao.frear(30);
        buzao.frear(30);
        buzao.frear(30);
        buzao.desligar();
        System.out.println();
    }
}
