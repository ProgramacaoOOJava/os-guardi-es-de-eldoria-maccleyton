public class Personagem {
    String nome;
    String classe;
    int nivel;
    int ptVida;
    double pdBase;

    public void exibirStatus() {
        System.out.println("Nome: " + nome + "\nClasse: " + classe + "\nNível: " + nivel +
                "\nPontos de Vida: " + ptVida + "\nPoder Base: " + pdBase + "\n");
    }

    public Personagem(String nome, String classe, int nivel, int ptVida, double pdBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.ptVida = ptVida;
        this.pdBase = pdBase;
    }
}

void main() {
    Personagem p1 = new Personagem("Cronos", "Mago", 10, 100, 500);
    Personagem p2 = new Personagem("Centauro", "Arqueiro", 7, 200, 300);

    p1.exibirStatus();
    p2.exibirStatus();
}