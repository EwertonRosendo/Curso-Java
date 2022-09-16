package ex001;

import ex001.entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Teste{
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");



        Client client = new Client("Ewerton Rosendo", "Rosendo@gmail", sdf.parse("03/10/2003"));

        OrderStatus orderstatus = OrderStatus.valueOf("PROCESSING");

        Product p = new Product("TV", 1000.0);

        Order order = new Order(new Date(), orderstatus);

        OrderItem oi1 = new OrderItem(1, 1000.0, p);

        order.addItem(oi1);



    }


}
