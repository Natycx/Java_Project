import java.util.Scanner;

public class Programa_sem_orientacao_objeto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as medidas do Triangulo A");
        double a1 = sc.nextDouble();
        double a2 = sc.nextDouble();
        double a3 = sc.nextDouble();
        System.out.println("Digiete as medidas do Triangulo B");
        double b1 = sc.nextDouble();
        double b2 = sc.nextDouble();
        double b3 = sc.nextDouble();

        double p = (a1 + a2 + a3) / 2;
        double areaA = Math.sqrt(p*(p - a1)*(p - a2)*(p - a3)) ;
        double q = (b1 + b2 + b3) / 2;
        double areaB = Math.sqrt(q*(q - b1)*(q - b2)*(q - b3)) ;
        System.out.println("O valor da area do triangulo A é: " + areaA);
        System.out.println("O valor da area do triangulo B é: " + areaB);
        if (areaA > areaB){
            System.out.printf("P triango com maior area é o: %.2f%n", areaA);
        } else {
            System.out.printf("P triango com maior area é o: %.2f%n", areaB);
        }

        sc.close();
    }
}
