package ArvoreAVL;

public class Arvore {

    private No noraiz;

    public Arvore(No noraiz) {
        this.noraiz = noraiz;
    }

    public boolean isEmpty() {
        if (noraiz == null) {
            return true;
        }
        return false;
    }

    public void imprimirArvore() {
        if (this.noraiz == null) {
            System.out.println("�rvore vazia");
        } else {
            imprimirArvore(this.noraiz);
        }
    }

    private void imprimirArvore(No node) {
        if (node.getNoEsquerda() != null) {
            imprimirArvore(node.getNoEsquerda());
        }
        if (node.getNoDireita() != null) {
            imprimirArvore(node.getNoDireita());
        }
        System.out.print(node.getValor() + "-");
        try {
            System.out.println("N�Esquerda: " + node.getNoEsquerda().getValor());
            System.out.println("N�Direita: " + node.getNoDireita().getValor());
        } catch (NullPointerException e) {
            e.getStackTrace();
        }
    }

    public void inserir(int valor) {
        inserir(this.noraiz, valor);
    }

    public void inserir(No node, int valor) {

        //alterar o m�todo para uma �rvore AVL
        if (this.noraiz == null) {
            this.noraiz = new No(null, valor);
        } else {
            if (valor < node.getValor()) {
                if (node.getNoEsquerda() != null) {
                    inserir(node.getNoEsquerda(), valor);
                } else {
                    //Se nodo esquerdo vazio insere o novo no aqui 
                    node.setNoEsquerda(new No(node, valor));
                }
                //Verifica se o valor a ser inserido � maior que o no corrente da �rvore, se sim vai para subarvore direita 
            } else if (valor > node.getValor()) {
                //Se tiver elemento no no direito continua a busca 
                if (node.getNoDireita() != null) {
                    inserir(node.getNoDireita(), valor);
                } else {
                    //Se nodo direito vazio insere o novo no aqui 
                    node.setNoDireita(new No(node, valor));
                }
            }
        }
    }

    public No remover(int valor) throws Exception {
        return remover(this.noraiz, valor);
    }

    private No remover(No node, int valor) {

        //alterar o m�todo para uma �rvore AVL
        
        if (this.noraiz == null) {
            System.out.println("�rvore vazia");
        } else {
            if (valor < node.getValor()) {
                node.setNoEsquerda(remover(node.getNoEsquerda(), valor));
            } else if (valor > node.getValor()) {
                node.setNoDireita(remover(node.getNoDireita(), valor));
            } else if (node.getNoEsquerda() != null && node.getNoDireita() != null) {
                /*2 filhos*/
                System.out.println("  Removeu No " + node.getValor());
                node.setValor(encontraMinimo(node.getNoDireita()).getValor());
                node.setNoDireita(removeMinimo(node.getNoDireita()));
            } else {
                System.out.println("  Removeu No " + node.getValor());
                node = (node.getNoEsquerda() != null) ? node.getNoEsquerda() : node.getNoDireita();
            }

        }
        return node;
    }

    private No removeMinimo(No node) {
        if (node == null) {
            System.out.println("  ERRO ");
        } else if (node.getNoEsquerda() != null) {
            node.setNoEsquerda(removeMinimo(node.getNoEsquerda()));
            return node;
        } else {
            return node.getNoDireita();
        }
        return null;
    }

    private No encontraMinimo(No node) {
        if (node != null) {
            while (node.getNoEsquerda() != null) {
                node = node.getNoEsquerda();
            }
        }
        return node;
    }
}
