// Classe que representa um personagem do jogo
public class Personagem {

    // Atributos dos personagens
    String nome;
    String classe;
    int nivel;
    int pontosDeVida;
    double poderBase;

    public void exibirStatus() {
        System.out.println("Nome: " + nome );
        System.out.println("Classe: " + classe );
        System.out.println("Nível: " + nivel );
        System.out.println("Pontos de Vida: " + pontosDeVida );
        System.out.println("Poder Base: " + poderBase );
        System.out.println(); // Linha em branco
    }

    // Classe principal
    public static void main(String[] args) {

        // Instanciando os dois personagens
        Personagem p1 = new Personagem();
        Personagem p2 = new Personagem();

        // Atribuindo valores diretamente aos atributos
        p1.nome = "Cronos";
        p1.classe = "Mago";
        p1.nivel = 10;
        p1.pontosDeVida = 200;
        p1.poderBase = 500;

        p2.nome = "Centauro";
        p2.classe = "Arqueiro";
        p2.nivel = 7;
        p2.pontosDeVida = 500;
        p2.poderBase = 300;

        p1.exibirStatus();
        p2.exibirStatus();
    }

    // Observação:
    // O professor demonstrou os exemplos em aula utilizando o método main
    // dentro da própria classe Personagem. Por isso, mantive esta estrutura
    // para seguir o padrão apresentado.
    // No entanto, o projeto também contém a classe Main separada,
    // conforme boas práticas e organização recomendada.
}