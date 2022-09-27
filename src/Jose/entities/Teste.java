package Jose.entities;

import java.util.*;

public class Teste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String[] nomesArray = new String[3];
        for (int i=0; i<nomesArray.length;i++){
            nomesArray[i] = sc.next();
        }


        int op = 0;
        while (true){

            System.out.println("[0] - Exibir");
            System.out.println("[1] - Por troca ");
            System.out.println("[2] - Por seleção ");
            System.out.println("[3] - Inserção");
            System.out.println("[4] - Sair");
            System.out.println("Informe a opção: ");
            op = sc.nextInt();


            if(op==1) {
                for (int i=0; i<nomesArray.length - 1;i++){
                    porTroca(nomesArray);
                }

            } else if (op== 2){
                for (int i=0; i<nomesArray.length - 1;i++){
                    porSelecao(nomesArray, i);
                }


            }else if (op == 3){
                for (int i=0; i<nomesArray.length - 1;i++) {
                    porInsercao(nomesArray);
                }

                }else if (op == 4){
                break;
            } else if ( op == 0) {
                for(String nome : nomesArray){
                    System.out.println(nome);
                }

            }else {
                System.out.println("Informe um valor valido SUA MULA");
            }

        }

    }
    public static void porTroca(String[] vet){
        for (int i=0; i < vet.length - 1; i++){
            if (vet[i].charAt(0) > vet[i+1].charAt(0)){
                String aux = vet[i];
                vet[i] = vet[i+1];
                vet[i+1] = aux;
            }
        }
    }

    public static void porSelecao(String[] vet, int n){
        for (int i = n; i<vet.length - 1; i++){
            String menor = vet[0];
            int index = 0;
            if(vet[i].charAt(0) < menor.charAt(0)){
                menor = vet[i];
                index = i;
                String aux = vet[n];
                vet[n] = menor;
                vet[index] = aux;
            }

        }

    }

    public static void porInsercao(String[] vet){
        for (int i=0; i < vet.length - 1; i++){

            if (vet[i+1].charAt(0) > vet[i].charAt(0)){
                String aux = vet[i+1];

            }

        }

    }
}
