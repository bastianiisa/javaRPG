import java.util.Scanner;

public class Monstro implements Personagem{
    private String nome;
    private int vida;

    public Monstro(String nome, Scanner scanner) {
        this.nome = nome;
        this.vida = Dados.rolarDados(scanner ,2, 8);
    }

    public void atacar(Personagem jogador, Scanner scanner) {
        int dano = Dados.rolarDados(scanner, 2, 8);
        System.out.println(nome + " ataca causando " + dano + " de dano!");
        jogador.reduzirVida(dano);
    }

    public int getVida() {
        return vida;
    }

    public void reduzirVida(int dano) {
        vida -= dano;
    }

    @Override
    public void atacar(Personagem monstro) {
        System.out.println("Foi realizado um ataque");
    }

    @Override
    public void usarItem() {
        System.out.println("Usou item");

    }

    @Override
    public void fugir() {
        System.out.println("Fugiu");

    }

    @Override
    public String getNome() {
        return nome;
    }

}
