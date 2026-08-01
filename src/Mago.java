public class Mago extends Personagem {
    double inteligencia;

    // Construtor da classe mago
    public Mago(String nome, int nivel, int pontosDeVida, double poderBase, double inteligencia) {
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
        this.inteligencia = inteligencia;
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
        System.out.println("Inteligência: " + inteligencia);
        System.out.println(); // Linha em branco
    }

    // Sobrescrita do método de habilidade especial
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " lança: Bola de Fogo!");
    }
}
