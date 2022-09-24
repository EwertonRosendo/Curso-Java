package arquivos.entities;

public class Product {
    private String nome;
    private double valor;
    private int qtd;

    public Product(){

    }

    public Product(String nome, double valor, int qtd) {
        this.nome = nome;
        this.valor = valor;
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double total(){
        return qtd*valor;
    }


}
