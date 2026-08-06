import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n1, n2, n3;
        n1 = input.nextLine();
        n2 = input.nextLine();
        n3 = input.nextLine();

        if (n1.equalsIgnoreCase("vertebrado") && n2.equalsIgnoreCase("ave") && n3.equalsIgnoreCase("carnivoro")) {
            System.out.println("aguia");
        } else if (n1.equalsIgnoreCase("vertebrado") && n2.equalsIgnoreCase("ave") && n3.equalsIgnoreCase("onivoro")) {
            System.out.println("pomba");
        } else if (n1.equalsIgnoreCase("vertebrado") && n2.equalsIgnoreCase("mamifero") && n3.equalsIgnoreCase("onivoro")) {
            System.out.println("homem");
        } else if (n1.equalsIgnoreCase("vertebrado") && n2.equalsIgnoreCase("mamifero") && n3.equalsIgnoreCase("herbivoro")) {
            System.out.println("vaca");
        } else if (n1.equalsIgnoreCase("invertebrado") && n2.equalsIgnoreCase("inseto") && n3.equalsIgnoreCase("hematofago")) {
            System.out.println("pulga");
        } else if (n1.equalsIgnoreCase("invertebrado") && n2.equalsIgnoreCase("inseto") && n3.equalsIgnoreCase("herbivoro")) {
            System.out.println("lagarta");
        } else if (n1.equalsIgnoreCase("invertebrado") && n2.equalsIgnoreCase("anelideo") && n3.equalsIgnoreCase("hematofago")) {
            System.out.println("sanguessuga");
        } else if (n1.equalsIgnoreCase("invertebrado") && n2.equalsIgnoreCase("anelideo") && n3.equalsIgnoreCase("onivoro")) {
            System.out.println("minhoca");
        }
    }
}