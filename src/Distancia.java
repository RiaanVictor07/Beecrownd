import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int valor= (60 * x1) / 30;
        System.out.println(valor+"minutos");
        sc.close();
    }
}
