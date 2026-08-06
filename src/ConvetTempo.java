import java.util.Scanner;

public class ConvetTempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int horas = N / 3600;
        int segundos = N %= 3600;
        int minutos = segundos / 60;
        segundos = segundos % 60;

        System.out.println(horas+":"+minutos+":"+segundos);
    }
}
