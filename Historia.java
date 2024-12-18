import java.util.Scanner;

public class Historia {
    public static void iniciarAventura(Personagem jogador) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Você encontra um monstro! Prepare-se para lutar.");
        Monstro monstro = new Monstro("Goblin", scanner);

        while (jogador.getVida() > 0 && monstro.getVida() > 0) {
            System.out.println("Escolha sua ação: ");
            System.out.println("1 - Atacar\n2 - Fugir");
            int escolha = scanner.nextInt();

            if (escolha == 1) {
                jogador.atacar(monstro);
                monstro.reduzirVida(Dados.rolarDados(scanner, 2, 8));
                monstro.atacar(jogador, scanner);
            } else {
                jogador.fugir();
                break;
            }
        }

        if (jogador.getVida() <= 0) {
            System.out.println("Você foi derrotado! Fim de jogo.");
        } else {
            System.out.println("Você sobreviveu! A aventura continua...");
        }
    }
}
