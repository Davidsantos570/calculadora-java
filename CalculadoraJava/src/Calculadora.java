import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("--- 🧮 Calculadora Java (Estudos ADS) ---");

        System.out.print("Digite o primeiro número: ");
        double num1 = leitor.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = leitor.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        double num2 = leitor.nextDouble();

        double resultado = 0;
        boolean erro = false;

        // Uso de switch-case para demonstrar lógica de programação estruturada
        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                // Atenção aos detalhes: tratamento de divisão por zero
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Não é possível dividir por zero.");
                    erro = true;
                }
                break;
            default:
                System.out.println("Operação inválida!");
                erro = true;
                break;
        }

        if (!erro) {
            System.out.println("O resultado é: " + resultado);
        }

        System.out.println("---------------------------------------");
        leitor.close();
    }
}
