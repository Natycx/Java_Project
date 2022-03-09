package Exercises.Secao_14;

public abstract class TaxPayer {

    private String name;
    private Double anualIncome;

    public TaxPayer(String name, Double renda) {
        this.name = name;
        this.anualIncome = renda;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }

    public abstract double tax();


}
