package Exercises.Secao_14;

public class Company extends TaxPayer {

    private Integer numerosFuncionarios;

    public Company(String name, Double renda, Integer numerosFuncionarios) {
        super(name, renda);
        this.numerosFuncionarios = numerosFuncionarios;
    }

    public Integer getNumerosFuncionarios() {
        return numerosFuncionarios;
    }

    public void setNumerosFuncionarios(Integer numerosFuncionarios) {
        this.numerosFuncionarios = numerosFuncionarios;
    }

    @Override
    public double tax() {
        if(getNumerosFuncionarios() > 10){
            return (getAnualIncome() * 0.14);
        } else {
            return(getAnualIncome() * 0.16);
        }
    }
}
