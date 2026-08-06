import java.util.Scanner;

public class SortSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min2 = 0;
        int min3 = 0;
        int min= Math.min(a, Math.min(b, c));
       if (min == a){
           min2 = Math.min(b, c);
           min3 = Math.max(b, c);
       }
       if (min == b){
           min2 = Math.min(a, c);
           min3 = Math.max(a, c);
       }
       if (min == c){
           min2 = Math.min(a, b);
           min3 = Math.max(a, b);
       }

        System.out.println(min);
        System.out.println(min2);
        System.out.println(min3);
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        sc.close();
    }
}
