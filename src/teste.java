// Abaixo segue um exemplo de código que você pode ou não utilizar:

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class teste {
    public static void main(String[] args) throws ParseException {
        /*
        String path = "C:\\Users\\Rosendo\\IdeaProjects\\AprendendoJava\\Curso-Java\\src\\out.txt";
        String path = "C:\\Users\\Rosendo\\IdeaProjects\\AprendendoJava\\Curso-Java\\src\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null){
                System.out.println(line);
                line=br.readLine();
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());

        }
        String[] lines = new String[] {"Bom dia", "Boa tarde", "Boa noite"};


        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for(String line: lines){
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        */
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Date d1 = sdf.parse("23/09/2022");

        Date d2 = sdf.parse("24/09/2022");

        long time = (((d2.getTime() - d1.getTime())/1000)/60)/60;
        System.out.println(time);
    }
}