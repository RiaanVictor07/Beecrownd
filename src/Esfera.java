import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio = sc.nextDouble();
        double v = (4.0/3.0) * 3.14159 * Math.pow(radio, 3);
        System.out.printf("VOLUME = %.3f%n", v);
        sc.close();
    }
}
