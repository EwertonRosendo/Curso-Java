package Produtos.entities;

public final class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct(){

    }

    public ImportedProduct(String name, Double price, Double customsFee){
        super(name, price);
        this.customsFee = customsFee;

    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag(){
        return String.format("Produto: %s\nValor:%.2f\nCustoms fee: %.2f", getName(), getPrice(), customsFee);
    }

    public double totalPrice(){
        return getPrice()+customsFee;
    }

    public String toString(){
        return String.format("Produto: %s\nValor:%.2f\nCustoms fee: %.2f", getName(), totalPrice(), customsFee);
    }

}
