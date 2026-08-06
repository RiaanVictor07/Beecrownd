import java.util.Scanner;
import java.io.IOException;

public class Media2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        Double c = sc.nextDouble();
        Double media = (a * 2 + b * 3 + c * 5)/10;
        System.out.printf("MEDIA = %.1f\n", media);
    }
}
