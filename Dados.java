import java.util.Scanner;

public class Dados {

    public static int rolarDados(Scanner scanner, int quantidade, int faces) {
        int resultadoTotal = 0;
        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Pressione Enter para rolar o dado " + i + " de " + quantidade + " (d" + faces + ").");
            scanner.nextLine(); 
            int resultado = (int) (Math.random() * faces) + 1; 
            System.out.println("Você rolou: " + resultado);
            resultadoTotal += resultado;
        }
        return resultadoTotal;
    }
}

