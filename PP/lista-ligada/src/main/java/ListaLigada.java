public class ListaLigada {

    private Node head;

    public ListaLigada() {
        this.head = new Node(0);
    }

    public Node getHead() { return head; }

    public void insereNode(int valor){
        Node novoNode = new Node(valor);
        novoNode.setNext(head.getNext());
        head.setNext(novoNode);
    }

    public void exibe(){
        Node atual = head.getNext();
        while (atual != null){
            System.out.print(atual.getInfo()+" ");
            atual = atual.getNext();
        }
    }

    public Node buscaNode(int valor){
        Node atual = head.getNext();
        while (atual != null){
            if(atual.getInfo() == valor){
                return atual;
            }else{
                atual = atual.getNext();
            }
//            return atual.getInfo() == valor ? atual : atual = atual.getNext();
        }
        return null;
    }

    public boolean removeNode(int valor){
        Node anterior = head;
        Node atual = head.getNext();

        while (atual != null){
            if(atual.getInfo() == valor){
                anterior.setNext(atual.getNext());
                return true;
            }else{
                anterior = atual;
                atual = atual.getNext();
            }
        }
        return false;
    }

    public int getTamanho(){
        Node atual = head.getNext();
        int tamanho = 0;
        while (atual != null){
            tamanho = tamanho + 1;
            atual = atual.getNext();
        }
        return tamanho;
    }

}
