package arquivos;

import arquivos.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String path = "C:\\Users\\Rosendo\\Documents\\ex.csv";
        List<Product> products = new ArrayList<>();

        File file = new File(path);
        String localFolder = file.getParent();

        boolean success = new File(localFolder+"/out").mkdir();
        System.out.println("pasta criado: "+success);

        String target = localFolder+"\\out\\sumary.csv";

        sc.close();

        try(BufferedReader bf = new BufferedReader(new FileReader(path))) {
            String item = bf.readLine();
            while (item!=null){
                System.out.println(item);
                String[] fields = item.split(",");
                String nome = fields[0];
                double valor = Double.parseDouble(fields[1]);
                int qtd = Integer.parseInt(fields[1]);
                products.add(new Product(nome, valor, qtd));

                item = bf.readLine();

            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(target))){
                for(Product items : products){
                    bw.write(items.getNome() + "," + String.format("%.2f", items.total()));
                    bw.newLine();
                }
                System.out.println(localFolder + "Created");
            }catch (IOException e){
                System.out.println(e.getMessage());
            }

        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
