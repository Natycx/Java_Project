

public class Main {
    public static void main(String[] args) {

        double x = 10.35784;
        System.out.println(x);
        System.out.printf("%.2f%n",x);

        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f metros%n", x);

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

        int z;
        double y;
        z = 5;
        y = 2 * z;
        System.out.println(z);
        System.out.println(y);

        double b, B, h, area;
        b = 6;
        B = 8;
        h = 5;
        area = (b + B)/2 * h;
        System.out.println(area);


    }
}
