package targetteste;

import java.util.Scanner;

public class TargetTeste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        verifica veri = new verifica();

        System.out.print("Informe um numero: ");
        int num = scanner.nextInt();

        if (veri.verifica(num)) {
            System.out.println(num + " pertence a sequencia de Fibonacci.");
        } else {
            System.out.println(num + " nao pertence a sequencia de Fibonacci.");
        }
    }
}


