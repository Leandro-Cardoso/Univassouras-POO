public abstract class Personagem {
    protected String nome;
    protected int nivel;

    public Personagem(String nome) {
        this.nome = nome;
        this.nivel = 1;
    }
    
    public abstract String atacar(Personagem personagem);

    public String detalhes() {
        return " Nome: " + this.nome + "\n Nivel: " + this.nivel;
    }
}
