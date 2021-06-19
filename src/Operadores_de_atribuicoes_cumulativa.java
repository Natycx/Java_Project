import java.util.Scanner;

public class Operadores_de_atribuicoes_cumulativa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minutos = sc.nextInt();
        double conta = 50.0;
        if (minutos > 100){
            conta += (minutos - 100) * 2.0;
        }
        System.out.printf("O valor a ser pago é de R$ %.2f%n", conta);
        sc.close();
    }
}
