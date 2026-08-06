import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cog = sc.nextInt();
        int qnt1 = sc.nextInt();
        double num2 = sc.nextDouble();
        int cog2 = sc.nextInt();
        int qnt2 = sc.nextInt();
        double num4 = sc.nextDouble();

        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", (qnt1 * num2) + (qnt2 * num4)));
        sc.close();

    }
}
