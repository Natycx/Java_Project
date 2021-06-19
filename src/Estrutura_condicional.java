import java.util.Scanner;

public class Estrutura_condicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hora;

        System.out.println("Que horas são ?");
        hora = sc.nextDouble();
                 if (hora >= 6.00 && hora < 12) {
                     System.out.println("Bom dia");
                 } else if (hora >= 12 && hora < 18){
                     System.out.println("Boa tarde");
                 } else if (hora >= 18 || hora < 6) {
                     System.out.println("Boa noite");
        }

                 sc.close();
    }
}
