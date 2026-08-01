public class Arqueiro extends Personagem {
    double velocidade;

    // Construtor da classe arqueiro
    public Arqueiro(String nome, int nivel, int pontosDeVida, double poderBase, double velocidade) {
        super(nome, "Arqueiro", nivel, pontosDeVida, poderBase);
        this.velocidade = velocidade;
    }

    // Exibir status atualizado
    @Override
    public void exibirStatus() {
        System.out.println("--- Status do Personagem ---");
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
        System.out.println("Pontos de Vida: " + pontosDeVida);
        System.out.println("Poder Base: " + poderBase);
        System.out.println("Velocidade: " + velocidade);
        System.out.println(); // Linha em branco
    }

    // Sobrescrita do método de habilidade especial
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " lança: Flechas Venenosas!");
    }
}
