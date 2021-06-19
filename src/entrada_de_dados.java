import java.util.Scanner;

public class entrada_de_dados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;
        char r;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        r = sc.next().charAt(0);
        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(r);

        sc.close();
    }
}
