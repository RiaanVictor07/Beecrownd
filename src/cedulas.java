import java.util.Scanner;

public class cedulas {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int valor = scanner.nextInt();
        int resultado;
        System.out.println(valor);
        resultado = (int) valor / 100;
        System.out.println(resultado + " nota(s) de R$ 100,00");
        valor = valor % 100;
        resultado = (int) valor / 50;
        System.out.println(resultado + " nota(s) de R$ 50,00");
        valor = valor % 50;
        resultado = (int) valor / 20;
        System.out.println(resultado + " nota(s) de R$ 20,00");
        valor = valor % 20;
        resultado = (int) valor / 10;
        System.out.println(resultado + " nota(s) de R$ 10,00");
        valor = valor % 10;
        resultado = (int) valor / 5;
        System.out.println(resultado + " nota(s) de R$ 5,00");
        valor = valor % 5;
        resultado = (int) valor / 2;
        System.out.println(resultado + " nota(s) de R$ 2,00");
        valor = valor % 2;
        resultado = (int) valor/1;
        System.out.println(resultado + " nota(s) de R$ 1,00");
        scanner.close();
    }
}
