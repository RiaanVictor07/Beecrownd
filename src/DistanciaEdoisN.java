import java.util.Scanner;

public class DistanciaEdoisN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira coordenada (x1, y1): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.print("Digite a segunda coordenada (x2, y2): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double distancia = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));

        System.out.println(String.format("%.4f", distancia));
        sc.close();
    }
}
