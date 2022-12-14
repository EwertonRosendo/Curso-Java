package Jose;
import java.util.Random;
import java.util.Scanner;
/**
 * O Projeto foi realizado pela equipe:
 * 1 - Matrícula e Nome do Aluno 01
 * 2 - Matrícula e Nome do Aluno 02
 * 3 - Matrícula e Nome do Aluno 03
 *
 * Turma: (2MA, 2MB, 2MC, 2MD, 2NA, 2NB ou 2NC)
 * Disciplina: Estrutura de Dados
 * Professor: José Mário Souza
 */
public class Program {
    public static void main(String[] args) {
        int vet[] = new int[20];
        int vetAux[] = new int[vet.length];
        Random aleatorio = new Random();
        for(int i=0; i<vet.length;i++){
            vet[i] = aleatorio.nextInt(1000);
        }
        System.out.println("### Lista Desordenada ###");
        for(int val:vet){
            System.out.print(val+"-");
        }
        System.out.println("");
        Scanner leia = new Scanner(System.in);
        int opc = 0;
        while (opc != 4){
            System.out.println("");
            System.out.println("# Vamos Ordenar? #");
            System.out.println("1 - Por Troca");
            System.out.println("2 - Por Seleção");
            System.out.println("3 - Por Inserção");
            System.out.println("4 - Sair");
            System.out.println("");
            System.out.print("Informe a opção desejada: ");
            opc = leia.nextInt();
            switch (opc) {
                case 1:
                    vetAux = vet;
                    ordenarPorTroca(vetAux);
                    break;
                case 2:
                    vetAux = vet;
                    ordenarPorSelecao(vetAux);
                    break;
                case 3:
                    vetAux = vet;
                    ordenarPorInsercao(vetAux);
                    break;
                case 4:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    private static void ordenarPorTroca(int vetAux[]) {
        int tro = 0; //Variável para contar a quantidade de Trocas desse método
        int com = 0; //Variável para contar a quantidade de Comparações desse método
        System.out.println("### Ordenação por Troca ###");
        for (int n=0; n<vetAux.length; n++){
            for (int i=0; i < vetAux.length - 1; i++){
                com++;
                if (vetAux[i] > vetAux[i+1]){
                    int aux = vetAux[i];
                    vetAux[i] = vetAux[i+1];
                    vetAux[i+1] = aux;
                    tro++;
                }
            }

        }
        listarComplexiade(tro,com);
        listarVetorOrdenado(vetAux);
    }

    private static void ordenarPorSelecao(int vetAux[]) {
        int tro = 0; //Variável para contar a quantidade de Trocas desse método
        int com = 0; //Variável para contar a quantidade de Comparações desse método
        System.out.println("### Ordenação por Seleção ###");
        int menor = 0;
        int index = 0;
        for (int i = 0; i<vetAux.length;i++){
            for (int inicio = i; inicio<vetAux.length;inicio++){
                com++;
                if (i==inicio){
                    menor = vetAux[inicio];
                }
                if (vetAux[inicio] < menor){
                    menor = vetAux[inicio];
                    index = inicio;
                    vetAux[index] = vetAux[i];
                    vetAux[i] = menor;
                    tro++;
                }
            }

        }
        listarComplexiade(tro,com);
        listarVetorOrdenado(vetAux);
    }

    private static void ordenarPorInsercao(int vetAux[]) {
        int tro = 0; //Variável para contar a quantidade de Trocas desse método
        int com = 0; //Variável para contar a quantidade de Comparações desse método
        System.out.println("### Ordenação por Inserção ###");
        for (int i=0; i<vetAux.length-1; i++){
            for (int j=vetAux.length-1; j>0 ;j--){
                com++;
                if (vetAux[j-1]>vetAux[j]){
                    int aux = vetAux[j];
                    vetAux[j] = vetAux[j-1];
                    vetAux[j-1] = aux;
                    tro++;
                    for (int v=j; v<vetAux.length-1; v++){
                        com++;
                        if (vetAux[v] > vetAux[v+1]){
                            int ax = vetAux[v];
                            vetAux[v] = vetAux[v+1];
                            vetAux[v+1] = ax;
                            tro++;
                        }
                    }
                }
            }
        }
        listarComplexiade(tro,com);
        listarVetorOrdenado(vetAux);
    }

    private static void listarVetorOrdenado(int vetAux[]) {
        System.out.println("### Lista Ordenada ###");
        for(int val:vetAux){
            System.out.print(val+"-");
        }
        System.out.println("");
    }

    private static void listarComplexiade(int tro, int com) {
        System.out.println("### Complexidade ###");
        System.out.println("Comparações: "+com);
        System.out.println("Trocas: "+tro);
    }

}
