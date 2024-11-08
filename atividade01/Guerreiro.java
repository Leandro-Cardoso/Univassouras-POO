public class Guerreiro extends Personagem {
    private String tipoArma;

    public Guerreiro(String nome, String tipoArma) {
        super(nome);
        this.tipoArma = tipoArma;
    }

    @Override
    public String atacar(Personagem personagem) {
        return " O guerreiro " + this.nome + " atacou com \"" + this.tipoArma + "\" o " + personagem.nome + " !!!";
    }

    public String getTipoArma() {
        return this.tipoArma;
    }
}
