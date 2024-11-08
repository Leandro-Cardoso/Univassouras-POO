public class Mago extends Personagem {
    private String magia;

    public Mago(String nome, String magia) {
        super(nome);
        this.magia = magia;
    }

    @Override
    public String atacar(Personagem personagem) {
        return " O mago " + this.nome + " lancou \"" + this.magia + "\" em " + personagem.nome + " !!!";
    }

    public String getMagia() {
        return this.magia;
    }
}
