import java.util.Scanner;
import java.io.IOException;

public class SalarioBonus {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        double salarioFixo = sc.nextDouble();
        double vendas = sc.nextDouble();
        double salarioFinal = salarioFixo + (vendas * 0.15);
        System.out.printf("TOTAL = R$ %.2f\n", salarioFinal);
    }
}
