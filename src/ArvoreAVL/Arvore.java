package ArvoreAVL;

public class Arvore {

    private No noraiz;

    public Arvore(No noraiz) {
        this.noraiz = noraiz;
    }
    public class No {

        private int altura = 1;
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

    private int altura(No no) {
        if (no == null)
            return 0;
        return no.altura;
    }
    public No inserir(No node, int valor) {

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

        node.altura = Math.max(altura(node.noEsquerda), altura(node.noDireita)) + 1;

        int balance = getBalance(node);

        if (balance > 1 && valor < node.noEsquerda.valor){
            return rightRotate(node);
        }


        // Right Right Case
        if (balance < -1 && valor > node.noDireita.valor)
            return leftRotate(node);

        // Left Right Case
        if (balance > 1 && valor > node.noEsquerda.valor)
        {
            node.noEsquerda =  leftRotate(node.noEsquerda);
            return rightRotate(node);
        }

        // Right Left Case
        if (balance < -1 && valor < node.noDireita.valor)
        {
            node.noDireita = rightRotate(node.noDireita);
            return leftRotate(node);
        }

        return node;
    }
    private No rightRotate(No y) {
        No x = y.noEsquerda;
        No T2 = x.noDireita;

        // Perform rotation
        x.noDireita = y;
        y.noEsquerda = T2;

        // Update alturas
        y.altura = Math.max(altura(y.noEsquerda), altura(y.noDireita))+1;
        x.altura = Math.max(altura(x.noEsquerda), altura(x.noDireita))+1;

        // Return new node
        return x;
    }

    public void preOrder(No node) {
        if (node != null) {
            preOrder(node.noEsquerda);
            System.out.printf("%d ", node.valor);
            preOrder(node.noDireita);
        }
    }

    private No minValueNode(No node) {
        No current = node;
        /* loop down to find the leftmost leaf */
        while (current.noEsquerda != null)
            current = current.noEsquerda;
        return current;
    }

    private No leftRotate(No x) {
        No y = x.noDireita;
        No T2 = y.noEsquerda;

        // Perform rotation
        y.noEsquerda = x;
        x.noDireita = T2;

        //  Update alturas
        x.altura = Math.max(altura(x.noEsquerda), altura(x.noDireita))+1;
        y.altura = Math.max(altura(y.noEsquerda), altura(y.noDireita))+1;

        // Return new node
        return y;
    }

    // Get Balance factor of node N
    private int getBalance(No N) {
        if (N == null)
            return 0;
        return altura(N.noEsquerda) - altura(N.noDireita);
    }

    public No remover(int valor) throws Exception {
        return remover(this.noraiz, valor);
    }

    private No remover(No node, int valor) {

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
            if (node == null)
                return node;

            node.altura = Math.max(altura(node.noEsquerda), altura(node.noDireita)) + 1;

            // STEP 3: GET THE BALANCE FACTOR OF THIS NODE (to check whether
            //  this node became unbalanced)
            int balance = getBalance(node);

            // If this node becomes unbalanced, then there are 4 cases

            // Left Left Case
            if (balance > 1 && getBalance(node.noEsquerda) >= 0)
                return rightRotate(node);

            // Left Right Case
            if (balance > 1 && getBalance(node.noEsquerda) < 0) {
                node.noEsquerda =  leftRotate(node.noEsquerda);
                return rightRotate(node);
            }

            // Right Right Case
            if (balance < -1 && getBalance(node.noDireita) <= 0)
                return leftRotate(node);

            // Right Left Case
            if (balance < -1 && getBalance(node.noDireita) > 0) {
                node.noDireita = rightRotate(node.noDireita);
                return leftRotate(node);
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
