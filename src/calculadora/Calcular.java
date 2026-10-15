
package calculadora;

import java.util.Scanner;

public class Calcular {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" calculadora ");

        System.out.print("Digite o primeiro numero: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double numero2 = scanner.nextDouble();

        System.out.println("\nEscolha a operacao:");
        System.out.println("1 - Soma (+)");
        System.out.println("2 - Subtracao (-)");
        System.out.println("3 - Multiplicacao (*)");
        System.out.println("4 - Divisao (/)");

        System.out.print("Digite a opcao: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1;
                System.out.println("Resultado: " + (numero1 + numero2));
                break;

            case 2:
                System.out.println("Resultado: " + (numero1 - numero2));
                break;

            case 3:
                System.out.println("Resultado: " + (numero1 * numero2));
                break;

            case 4:
                if (numero2 != 0) {
                    System.out.println("Resultado: " + (numero1 / numero2));
                } else {
                    System.out.println("Erro: nao e possivel dividir por zero!");
                }
                break;

            default:
                System.out.println("Opcao invalida!");
        }

        scanner.close();
    }
}
