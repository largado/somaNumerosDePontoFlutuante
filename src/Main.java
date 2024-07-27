import java.util.Scanner;

// soma 2 números de ponto flutuante
// 08/10/2023
// capítulo 1 página 7
// teste sincronização com visual studio code em 27/07/2024

public class Main {
    public static void main(String[] args) {

        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        float A = entrada1.nextFloat();
        float B = entrada2.nextFloat();

        double C = A+B;

        System.out.println("O resultado da soma é: " + C);

    }
}