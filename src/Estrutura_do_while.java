import java.util.Scanner;

public class Estrutura_do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char resp;
      do {
          System.out.print("Digite a temperatura em Celsios: ");
          double C = sc.nextDouble();
          double F = (9 * C) / 5 + 32;
          System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
          System.out.print("Deseja repetir (s/n)? ");
          resp = sc.next().charAt(0);
      } while (resp != 'n');

        sc.close();
    }
}
