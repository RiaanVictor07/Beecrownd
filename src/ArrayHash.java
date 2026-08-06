import java.util.Scanner;
import java.io.IOException;

public class ArrayHash {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        for (int t = 0; t < n; t++) {
            long valor = 0;
            int L = Integer.parseInt(sc.nextLine().trim());
            for (int i = 0; i < L; i++) {
                String frase = sc.nextLine();
                for (int j = 0; j < frase.length(); j++) {
                    valor += (frase.charAt(j) - 'A') + i + j;
                }
            }
            System.out.println(valor);
        }

    }
}
