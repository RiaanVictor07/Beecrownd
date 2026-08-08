import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double valorDouble = scanner.nextDouble();

        // Converte para centavos (inteiro) para evitar erro de ponto flutuante
        // Math.round evita problemas tipo 550.99999 virar 550
        long valor = Math.round(valorDouble * 100);
        long resultado;

        System.out.println("NOTAS:");
        resultado = valor / 10000; // 100.00
        System.out.println(resultado + " nota(s) de R$ 100.00");
        valor = valor % 10000;

        resultado = valor / 5000; // 50.00
        System.out.println(resultado + " nota(s) de R$ 50.00");
        valor = valor % 5000;

        resultado = valor / 2000; // 20.00
        System.out.println(resultado + " nota(s) de R$ 20.00");
        valor = valor % 2000;

        resultado = valor / 1000; // 10.00
        System.out.println(resultado + " nota(s) de R$ 10.00");
        valor = valor % 1000;

        resultado = valor / 500; // 5.00
        System.out.println(resultado + " nota(s) de R$ 5.00");
        valor = valor % 500;

        resultado = valor / 200; // 2.00
        System.out.println(resultado + " nota(s) de R$ 2.00");
        valor = valor % 200;

        System.out.println("MOEDAS:");
        resultado = valor / 100; // 1.00
        System.out.println(resultado + " moeda(s) de R$ 1.00");
        valor = valor % 100;

        resultado = valor / 50; // 0.50
        System.out.println(resultado + " moeda(s) de R$ 0.50");
        valor = valor % 50;

        resultado = valor / 25; // 0.25
        System.out.println(resultado + " moeda(s) de R$ 0.25");
        valor = valor % 25;

        resultado = valor / 10; // 0.10
        System.out.println(resultado + " moeda(s) de R$ 0.10");
        valor = valor % 10;

        resultado = valor / 5; // 0.05
        System.out.println(resultado + " moeda(s) de R$ 0.05");
        valor = valor % 5;

        resultado = valor / 1; // 0.01
        System.out.println(resultado + " moeda(s) de R$ 0.01");

        scanner.close();
    }
}