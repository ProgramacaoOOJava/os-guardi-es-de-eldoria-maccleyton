// Classe que representa um personagem do jogo
public abstract class Personagem {

    // Atributos dos personagens
    String nome;
    String classe;
    int nivel;
    int pontosDeVida;
    double poderBase;

    // Construtor da classe personagem
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    public void exibirStatus() {
        System.out.println("--- Status do Personagem ---");
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
        System.out.println("Pontos de Vida: " + pontosDeVida);
        System.out.println("Poder Base: " + poderBase);
        System.out.println(); // Linha em branco
    }

    public abstract void usarHabilidadeEspecial();
}