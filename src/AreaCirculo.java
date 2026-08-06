import java.util.Scanner;


public class AreaCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double raio, area;
        raio = sc.nextDouble();
        area = 3.14159 * (raio * raio);
        System.out.format("A=%.4f\n", area);
    }
}
