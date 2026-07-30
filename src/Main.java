public class Main {
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
}
