package Secao_17.Exercise;

import Secao_17.Exercise.entities.Contract;
import Secao_17.Exercise.entities.Installment;
import Secao_17.Exercise.service.ContractService;
import Secao_17.Exercise.service.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter Contract data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Date (dd/MM/yyyy): ");
        Date date = sdf.parse(sc.next());
        System.out.print("Contract value: ");
        double value = sc.nextDouble();

        Contract contract = new Contract(number,date,value);

        System.out.print("Enter number of installments: ");
        int parcelas = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, parcelas);
        System.out.println("Installments: ");
        for (Installment x : contract.getInstallments()){
            System.out.println(x);
        }

        sc.close();
    }

}
