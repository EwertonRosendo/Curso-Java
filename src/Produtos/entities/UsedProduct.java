package Produtos.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProduct extends Product {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date manufactureDate;

    public UsedProduct(){

    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    @Override
    public String priceTag(){
        return "Name: "+ getName() +" Price: "+getPrice()+"\n Date: "+manufactureDate;
    }

    public String toString(){
        return "Name: "+ getName() +" Price: "+getPrice()+"\nDate: "+sdf.format(manufactureDate);
    }
}
