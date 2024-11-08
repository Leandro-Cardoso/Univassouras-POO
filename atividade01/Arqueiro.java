public class Arqueiro extends Personagem {
    private String municao;

    public Arqueiro(String nome, String municao) {
        super(nome);
        this.municao = municao;
    }

    @Override
    public String atacar(Personagem personagem) {
        return " O arqueiro " + this.nome + " disparou \"" + this.municao + "\" em " + personagem.nome + " !!!";
    }

    public String getMunicao() {
        return this.municao;
    }
}
