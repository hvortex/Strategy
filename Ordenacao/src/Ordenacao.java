import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ordenacao {
    public static void main(String[] args) {
        ContextoDeOrdenacao contexto = new ContextoDeOrdenacao();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o método de ordenação:");
        System.out.println("1 - Bubble Sort");
        System.out.println("2 - Selection Sort");
        System.out.println("3 - Insertion Sort");
        int escolha = scanner.nextInt();

        List<Integer> numeros = new ArrayList<>();
        System.out.println("Digite os números a serem ordenados (digite um valor não numérico para finalizar):");

        while (scanner.hasNextInt()) {
            numeros.add(scanner.nextInt());
        }

        switch (escolha) {
            case 1:
                contexto.setEstrategia(new OrdenacaoBubbleSort());
                break;
            case 2:
                contexto.setEstrategia(new OrdenacaoSelectionSort());
                break;
            case 3:
                contexto.setEstrategia(new OrdenacaoInsertionSort());
                break;
            default:
                System.out.println("Escolha inválida. Usando Bubble Sort por padrão.");
                contexto.setEstrategia(new OrdenacaoBubbleSort());
                break;
        }

        contexto.executarOrdenacao(numeros);
        scanner.close();
    }
}