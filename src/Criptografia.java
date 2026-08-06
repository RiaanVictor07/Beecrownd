import java.util.Scanner;
import java.io.IOException;

public class Criptografia {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < N; i++) {
            String M = sc.nextLine();

            // Passo 1: shift +3 nas letras
            StringBuilder sb = new StringBuilder();
            for (char c : M.toCharArray()) {
                sb.append(Character.isLetter(c) ? (char)(c + 3) : c);
            }

            // Passo 2: inverter a string
            String reversed = sb.reverse().toString();

            // Passo 3: primeira metade intacta, segunda metade com shift -1
            int half = reversed.length() / 2;
            StringBuilder result = new StringBuilder(reversed.substring(0, half));
            for (char c : reversed.substring(half).toCharArray()) {
                result.append((char)(c - 1));
            }
            System.out.println(result);
        }
    }
}