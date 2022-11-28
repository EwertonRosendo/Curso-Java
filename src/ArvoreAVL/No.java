package ArvoreAVL;

public class No {

    private int valor;
    private No noPai;
    private No noEsquerda;
    private No noDireita;

    No(No noPai, int valor) {
        this.valor = valor;
        this.noPai = noPai;
        this.noEsquerda = null;
        this.noDireita = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public No getNoPai() {
        return noPai;
    }

    public void setNoPai(No noPai) {
        this.noPai = noPai;
    }

    public No getNoEsquerda() {
        return noEsquerda;
    }

    public void setNoEsquerda(No noEsquerda) {
        this.noEsquerda = noEsquerda;
    }

    public No getNoDireita() {
        return noDireita;
    }

    public void setNoDireita(No noDireita) {
        this.noDireita = noDireita;
    }

    public No(int valor, No noPai, No noEsquerda, No noDireita) {
        this.valor = valor;
        this.noPai = noPai;
        this.noEsquerda = noEsquerda;
        this.noDireita = noDireita;
    }

}
