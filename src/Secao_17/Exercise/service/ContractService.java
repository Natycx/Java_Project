package Secao_17.Exercise.service;

import Secao_17.Exercise.entities.Contract;
import Secao_17.Exercise.entities.Installment;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months){
        double value = contract.getTotalValue() / months;
        for (int i = 1; i <=months; i++){
            Date date = addMonths(contract.getDate(), i);
            double updatedQuota = value + onlinePaymentService.interest(value,i);
            double fullQuota = updatedQuota + onlinePaymentService.paymentFee(updatedQuota);
            contract.getInstallments().add(new Installment(date, fullQuota));

        }
    }
    private Date addMonths(Date date, int n){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, n);
        return cal.getTime();
    }

}

