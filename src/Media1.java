import java.util.Scanner;
import java.io.IOException;


public class Media1 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Double a = input.nextDouble();
        Double b = input.nextDouble();
        Double media = (a * 3.5 + b * 7.5)/11;
        System.out.printf("MEDIA = %.5f\n", media);
    }
}
