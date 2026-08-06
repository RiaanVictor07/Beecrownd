import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double pi=3.14159;
        Double A = sc.nextDouble();
        Double B = sc.nextDouble();
        Double C = sc.nextDouble();

        Double areadoTriangulo = (A * C) / 2;
        Double circulo = pi * (C*C);
        Double trapezio = ((A+B)/2)*C;
        Double quadrado = B*B;
        Double retangulo = A*B;

        System.out.printf("TRIANGULO: %.3f\n", areadoTriangulo);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETANGULO: %.3f\n", retangulo);


    }
}
