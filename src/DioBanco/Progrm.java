package DioBanco;

import DioBanco.entities.Banco;
import DioBanco.entities.Conta;
import DioBanco.entities.Endereco;

import java.util.Locale;
import java.util.Scanner;

public class Progrm {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Banco banco = new Banco();
        while (true){
            System.out.println("[0] - Sair");
            System.out.println("[1] - Listar contas");
            System.out.println("[2] - Criar conta");
            int opt = sc.nextInt();

            if (opt == 0){
                break;
            }
            else if(opt==1){
                for (Conta act: banco.getList()){
                    System.out.println(act);
                }
            }

            else if (opt == 2){
                sc.nextLine();
                System.out.println("Informe o  Usuario: ");
                String usuario = sc.nextLine();

                System.out.println("Informe o saldo Inicial: ");
                Double saltoInicial = sc.nextDouble();

                sc.nextLine();
                System.out.println("Informe o Numero do celular: ");
                String telefone = sc.nextLine();

                System.out.println("Informe sua Rua: ");
                String rua = sc.nextLine();

                System.out.println("Informe seu cep: ");
                String cep = sc.nextLine();

                System.out.println("Informe o numero da casa/apt: ");
                Integer numCasa = sc.nextInt();

                sc.nextLine();
                System.out.println("Informe o complemento: ");
                String complemento = sc.nextLine();

                Integer id = banco.getList().size()+1;

                banco.addList(new Conta(id, usuario, saltoInicial, telefone, new Endereco(rua, cep, numCasa,  complemento)));

            }

        }


    }
}
