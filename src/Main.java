import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Instanciando os três personagens
        Guerreiro prometeus = new Guerreiro("Prometeus", 5, 300, 600, 150);
        Mago cronos = new Mago("Cronos", 10, 200, 500, 200);
        Arqueiro centauro = new Arqueiro("Centauro", 7, 500, 300, 300);
        Guerreiro arthur = new Guerreiro("Arthur", 9, 350, 550, 350);
        Mago merlin = new Mago("Merlin", 8, 250, 400, 300);
        Arqueiro galahad = new Arqueiro("Galahad", 6, 350, 400, 200);

        // Criando grupos
        Grupo grupoA = new Grupo("Titãs");
        grupoA.adicionarPersonagem(prometeus);
        grupoA.adicionarPersonagem(cronos);
        grupoA.adicionarPersonagem(centauro);

        Grupo grupoB = new Grupo("Camelot");
        grupoB.adicionarPersonagem(arthur);
        grupoB.adicionarPersonagem(merlin);
        grupoB.adicionarPersonagem(galahad);

        // Listar membros do grupo
        grupoA.listarPersonagens();
        grupoB.listarPersonagens();

        // Ordenar membros por nivel (opcional, se Personagem implementar Comparable)
        grupoA.ordenarMembroPorNivel();
        grupoA.listarPersonagens();
        grupoB.ordenarMembroPorNivel();
        grupoB.listarPersonagens();

        // Batalhas
        System.out.println("\n--- Batalha Automática (Aleatória) ---");

        Random random = new Random();

        // Sorteia um número de 0 até o tamanho da lista do Grupo A menos 1
        int indiceSorteadoA = random.nextInt(grupoA.getMembros().size());
        Personagem lutadorA = grupoA.getMembros().get(indiceSorteadoA);

        // Sorteia um número de 0 até o tamanho da lista do Grupo B menos 1
        int indiceSorteadoB = random.nextInt(grupoB.getMembros().size());
        Personagem lutadorB = grupoB.getMembros().get(indiceSorteadoB);

        // Coloca os sorteados para batalhar!
        grupoA.batalhar(lutadorA, lutadorB);
    }

}
