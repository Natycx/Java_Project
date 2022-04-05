package Exercises.Secao_17;

public class Produtos {
    private String name;
    private Double price;
    private Integer amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Produtos(String name, Double price, Integer amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public double total(){
        return price * amount;
    }

}
