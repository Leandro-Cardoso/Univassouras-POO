public class Main {
    public static void main(String[] args) {
        // Instanciando:
        Guerreiro guerreiro = new Guerreiro("Aragorn", "Espada Longa");
        Mago mago = new Mago("Gandalf", "Bola de Fogo");
        Arqueiro arqueiro = new Arqueiro("Legolas", "Flecha Envenenada");

        // Exibindo informacoes:
        System.out.println("\n" + guerreiro.detalhes());
        System.out.println("\n" + mago.detalhes());
        System.out.println("\n" + arqueiro.detalhes());

        // Utilizando o metodo atacar():
        System.out.println("\n" + guerreiro.atacar(mago));
        System.out.println(mago.atacar(guerreiro));
        System.out.println(arqueiro.atacar(guerreiro));

        System.out.println();
    }
}
