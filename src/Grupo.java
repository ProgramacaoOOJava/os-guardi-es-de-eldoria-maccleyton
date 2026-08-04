import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Grupo {
    private String nomeDoGrupo;
    private List<Personagem> membros;

    public Grupo(String nomeDoGrupo) {
        this.nomeDoGrupo = nomeDoGrupo;
        this.membros = new ArrayList<>();
    }

    public String getNomeDoGrupo() {
        return nomeDoGrupo;
    }

    public void adicionarPersonagem(Personagem personagem) {
        this.membros.add(personagem);
    }

    public void listarPersonagens() {
        System.out.println("\n--- Membros do Grupo " + nomeDoGrupo + " ---");
        for (Personagem personagem : membros) {
            System.out.println(personagem.getNome());
        }
        System.out.println("----------------------------------------------");
    }

    public void batalhar(Personagem p1, Personagem p2) {
        System.out.println("\n--- Início da Batalha ---");

        // Personagens usam suas habilidades especiais!
        p1.usarHabilidadeEspecial();
        p2.usarHabilidadeEspecial();
        System.out.println(); // Linha em branco para organizar a saída

        // Calculando o poder total
        int poderTotalP1 = (int) (p1.getNivel() * p1.getPoderBase());
        int poderTotalP2 = (int) (p2.getNivel() * p2.getPoderBase());

        if (poderTotalP1 > poderTotalP2) {
            System.out.println(p1.getClasse() + " " + p1.getNome() + " venceu! Poder total: " + poderTotalP1);
        } else if (poderTotalP2 > poderTotalP1) {
            System.out.println(p2.getClasse() + " " + p2.getNome() + " venceu! Poder total: " + poderTotalP2);
        } else {
            System.out.println("Empate entre: " + p1.getNome() + " e " + p2.getNome() + "! Poder total: " + poderTotalP1);
        }

        System.out.println("--- Fim da Batalha ---");
    }

    public void ordenarMembroPorNivel() {
        Collections.sort(this.membros);
        System.out.println("Membros do Grupo " + nomeDoGrupo + " ordenados por nível.");
    }

    public List<Personagem> getMembros() {
        return membros;
    }
}
