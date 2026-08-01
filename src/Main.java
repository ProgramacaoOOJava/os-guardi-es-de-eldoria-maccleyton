import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Instanciando os três personagens
        Guerreiro galahad = new Guerreiro("Galahad", 5, 300, 600, 150);
        Mago cronos = new Mago("Cronos", 10, 200, 500, 200);
        Arqueiro centauro = new Arqueiro("Centauro", 7, 500, 300, 300);

        // Exibindo status
        galahad.exibirStatus();
        cronos.exibirStatus();
        centauro.exibirStatus();

        // Usando habilidades especiais
        galahad.usarHabilidadeEspecial();
        cronos.usarHabilidadeEspecial();
        centauro.usarHabilidadeEspecial();

        // Demonstração de Polimorfismo
        System.out.println("\n--- Demonstração de Polimorfismo ---");
        List<Personagem> herois = new ArrayList<>();
        herois.add(galahad);
        herois.add(cronos);
        herois.add(centauro);

        herois.add(new Guerreiro("Arthur", 9, 350, 550, 350));
        herois.add(new Mago("Merlin", 8, 250, 400, 300));
        herois.add(new Arqueiro("Valkyria", 6, 350, 400, 200));

        for (Personagem p : herois) {
            p.exibirStatus();
            p.usarHabilidadeEspecial();
            System.out.println("-------------------------------------");
        }
    }

}
