public class ListaLigadaOrdenada extends ListaLigada {
    
    ListaLigadaOrdenada ll = new ListaLigadaOrdenada();

    
    public void insereNode(int valor){
        Node novoNode = new Node(valor);
        Node anterior = ll.getHead();
        Node atual = ll.getHead().getNext();
        boolean inseriu = false;
        
        while(atual != null && !inseriu) {
            if(valor >= ) {
                novoNode.setNext(ll)
                
                anterior = atual;
                atual = atual.getNext();
            }else{
                
                
                anterior = atual;
                atual = atual.getNext();
            }
        }
        
        novoNode.setNext(ll.getHead().getNext());
        ll.getHead().setNext(novoNode);
    }
    
    public static void main(String[] args){
        
        
    }
    
}