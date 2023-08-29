import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");

        try {
            int parametroUm = terminal.nextInt();
            System.out.print("Digite o segundo parâmetro: ");
            try {
                int parametroDois = terminal.nextInt();

                try {
                    // chamando o método contendo a lógica de contagem
                    contar(parametroUm, parametroDois);

                } catch (ParametrosInvalidosException exception) {
                    System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
                }
            } catch (InputMismatchException exception) {
                System.out.println("Você deve escolher um valor inteiro como parâmetro.");
            }

        } catch (InputMismatchException exception) {
            System.out.println("Você deve escolher um valor inteiro como parâmetro.");
        }

        terminal.close();

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número: " + i);
        }
        // realizar o for para imprimir os números com base na variável contagem
    }
}