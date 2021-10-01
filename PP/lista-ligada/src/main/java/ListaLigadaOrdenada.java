public class ListaLigadaOrdenada extends ListaLigada {
    
    ListaLigada ll = new ListaLigada();

    public void insereNode(int valor){
        Node novoNode = new Node(valor);
        Node anterior = ll.getHead();
        Node atual = ll.getHead().getNext();
        boolean inseriu = false;
        
        while(atual != null && !inseriu) {
            if(atual.getInfo() < valor) {
                anterior.setNext(novoNode);
                novoNode.setNext(atual);
                inseriu=true;
            }else{
                anterior = atual;
                atual = atual.getNext();
            }
        }
        if(!inseriu){
            anterior.setNext(novoNode);
        }
    }

    public Node buscaNode(int valor){
        Node atual = ll.getHead().getNext();
        while (atual != null){
            if(atual.getInfo() > valor){
                return atual;
            }else{
                atual = atual.getNext();
            }
        }
        return null;
    }

    public static void main(String[] args){

        ListaLigadaOrdenada lista = new ListaLigadaOrdenada();

        lista.insereNode(1);
        lista.insereNode(10);
        lista.insereNode(2);
        lista.ll.exibe();
        System.out.println("================");
        Node valor = lista.buscaNode(1);
        System.out.println(valor.getInfo());

        
    }
    
}