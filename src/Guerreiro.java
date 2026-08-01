public class Guerreiro extends Personagem {
    double forca;

    // Construtor da classe guerreiro
    public Guerreiro(String nome, int nivel, int pontosDeVida, double poderBase, double forca) {
        super(nome, "Guerreiro", nivel, pontosDeVida, poderBase);
        this.forca = forca;
    }

    // Exibir status atualizado
    @Override
    public void exibirStatus() {
        System.out.println("--- Status do Personagem ---");
        System.out.println("Nome: " + nome );
        System.out.println("Classe: " + classe );
        System.out.println("Nível: " + nivel );
        System.out.println("Pontos de Vida: " + pontosDeVida );
        System.out.println("Poder Base: " + poderBase );
        System.out.println("Força: " + forca );
        System.out.println(); // Linha em branco
    }

    // Sobrescrita do método de habilidade especial
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " ataca com: Espada Flamejante!");
    }
}
