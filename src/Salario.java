import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();
        double horas = input.nextInt();
        double valor = input.nextDouble();

        double salario = horas * valor;

        System.out.println("NUMBER = "+numero);
        System.out.println("SALARY = "+ String.format("U$ %.2f", salario));
    }
}
