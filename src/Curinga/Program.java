package Curinga;

import Curinga.entities.Circle;
import Curinga.entities.Rectangle;
import Curinga.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Shape> list = new ArrayList<>();

        list.add(new Circle(2));
        list.add(new Rectangle(2, 2));

        double soma = 0;



        System.out.println(totalArea(list));

    }
    public static double totalArea(List<? extends Shape> list) {
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.totalArea();
        }
        return sum;
    }
}
