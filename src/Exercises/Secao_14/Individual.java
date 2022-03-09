package Exercises.Secao_14;

public class Individual extends TaxPayer {
    private Double healthExpenditures;

    public Individual(String name, Double renda, Double gastosSaude) {
        super(name, renda);
        this.healthExpenditures = gastosSaude;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }


    @Override
    public double tax() {
        double valor;
        if(getAnualIncome() < 20000.00){
            valor = getAnualIncome() * 0.15 - getAnualIncome() * 0.5;
            return valor;
        } else {
            return (getAnualIncome() * 0.25) - getAnualIncome() * 0.5;
        }
    }
}
