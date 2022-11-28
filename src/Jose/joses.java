package Jose;
import java.util.Scanner;
public class joses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vPilha[] = new String[5];
        String vFila[] = new String[5];
        vFila[0] = "Rosa";
        vFila[1] = "Isa";
        vFila[2] = "Lucas";
        vFila[3] = "Igor";
        vFila[4] = "Manu";

        int inicio=0;
        int fim=vFila.length-1;
        int opc = 0;
        while (opc != 7){
            System.out.println("#### PILHA ####");
            System.out.println("1 - Empilhar");
            System.out.println("2 - Desempilhar");
            System.out.println("3 - Listar Pilha");
            System.out.println("#### FILA ####");
            System.out.println("4 - Incluir Fila");
            System.out.println("5 - Remover Fila");
            System.out.println("6 - Listar Fila");
            System.out.println("##############");
            System.out.println("7 - Sair");
            System.out.println("");
            System.out.print("Informe a opção desejada: ");
            opc = sc.nextInt();
            System.out.println();



            switch (opc) {
                case 1:
                    sc.nextLine();
                    for (int topo=0; topo<vPilha.length; topo++){
                       if (vPilha[topo] == null) {
                           System.out.println("Informe um nome para ser inserido como pilha na posição "+topo+":");
                           if (topo==0){vPilha[topo] = "rosa";}
                           else if (topo==1){vPilha[topo] = "lucas";}
                           else if (topo==2){vPilha[topo] = "isa";}
                           else if (topo==3){vPilha[topo] = "manu";}
                           else {vPilha[topo] = "igor";}
                           //vPilha[topo] = sc.nextLine();
                       }
                    }
                    break;
                case 2:
                    for (int topo=vPilha.length-1;-1<topo;topo--){
                        if (vPilha[topo]!=null){
                            vPilha[topo] = null;
                            break;
                        }
                    }

                    break;
                case 3:
                    for(String nome:vPilha){
                        System.out.println("String = "+ nome);
                    }
                    break;


                case 4:
                    for (int i =0; i<vFila.length; i++){
                        if (vFila[i] == null){
                            System.out.println("Informe o nome para ser inserido: ");
                            vFila[i] = sc.nextLine();
                            fim = i;
                        } else {
                            System.out.println("A fila está cheia");
                        }
                    }
                    break;
                case 5:
                    vFila[inicio] = null;
                    if ((inicio+1)>vFila.length-1){
                        inicio = 0;
                    }
                    else {
                        inicio++;
                    }

                    break;
                case 6:
                    for (int i=inicio; i<fim+1; i++){
                        System.out.println("Valor: "+vFila[i]);
                        if ((i+1)>5){
                            i=0;
                        }
                    }

                    break;
                case 7:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }


}
