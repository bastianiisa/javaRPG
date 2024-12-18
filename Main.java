import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Jogo de Aventuras!");
        System.out.println("Digite o nome do seu personagem: ");
        String nome = scanner.nextLine();

        System.out.println("Escolha sua classe:");
        System.out.println("1 - Guerreiro\n2 - Mago\n3 - Arqueiro");
        int escolhaClasse = scanner.nextInt();

        Personagem jogador;
        if (escolhaClasse == 1) {
            jogador = new Guerreiro(nome);
        } else if (escolhaClasse == 2) {
            jogador = new Mago(nome);
        } else {
            jogador = new Arqueiro(nome);
        }

        System.out.println("Personagem criado: " + jogador);
        System.out.println("A aventura começa agora...\n");

        Historia.iniciarAventura(jogador);
    }
}
