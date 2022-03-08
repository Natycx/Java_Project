package Exercises.Secao_14;

public class ImportedProduct extends Product{

    private Double costumsFee;

    public ImportedProduct(String name, Double price, Double costumsFee) {
        super(name, price);
        this.costumsFee = costumsFee;
    }

    public Double getCostumsFee() {
        return costumsFee;
    }

    public void setCostumsFee(Double costumsFee) {
        this.costumsFee = costumsFee;
    }
    public Double totalPrice(){
        return getPrice() + getCostumsFee();
    }

    @Override
    public String priceTag() {
        return getName() + " $ " + String.format("%.2f", getPrice()) + "(Customs fee: $ " + String.format("%.2f", getCostumsFee()) + ")";

    }
}
