import java.util.Scanner;
import java.io.IOException;

public class FormulaBhaskara {
    public static void main(String[] args) throws IOException  {
        Scanner sc = new Scanner(System.in);
        Double a= sc.nextDouble();
        Double b= sc.nextDouble();
        Double c= sc.nextDouble();
        Double delta= b*b -4*a*c;

        if (delta < 0 || a == 0) {
            System.out.println("Impossivel calcular");
        } else {
            Double R1 = (-b + Math.sqrt(delta)) / (2 * a);
            Double R2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.format("R1 = %.5f\n", R1);
            System.out.format("R2 = %.5f\n", R2);
        }
    }
}
