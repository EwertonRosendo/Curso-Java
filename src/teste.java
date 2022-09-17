// Abaixo segue um exemplo de código que você pode ou não utilizar:

import java.util.*;

public class teste {
    public static void main(String[] args){
        List<String> numeros = List.of("1", "2", "5", "3")  ;
        System.out.println(numeros.stream().mapToInt(Integer::parseInt).average());
    }
}