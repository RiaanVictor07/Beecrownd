import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cd = sc.nextInt();
        int qtd = sc.nextInt();
        double total = 0.0;
        switch (cd) {
            case 1:
                total = qtd * 4.00;
                break;
            case 2 :
                total = qtd * 4.50;
                break;
            case 3 :
                total = qtd * 5.00;
                break;
            case 4:
                total = qtd * 2.00;
                break;
            case 5:
                total = qtd * 1.50;
                break;
            default:
                System.out.println("Código inválido");
                break;
        }
        System.out.printf("Total: R$ %.2f%n", total);
        sc.close();
    }
}
