public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Leandro", 185, 65);
        Carro carro = new Carro("Fiat", "Uno Way", "preto", 2015);
        Moto moto = new Moto("Honda", "CRF 250F", "verde", 2020);

        // Interação da pessoa com o carro:
        pessoa.ligarAutomovel(carro);
        carro.passarMarcha('1');
        carro.acelerar(10);
        carro.passarMarcha('2');
        carro.acelerar(15);
        carro.passarMarcha('3');
        carro.acelerar(15);
        pessoa.desligarAutomovel(carro);

        // Interação da pessoa com a moto:
        pessoa.ligarAutomovel(moto);
        moto.passarMarcha('1');
        moto.acelerar(10);
        moto.passarMarcha('2');
        moto.acelerar(15);
        moto.passarMarcha('3');
        moto.acelerar(15);
        pessoa.desligarAutomovel(moto);
    }
}
