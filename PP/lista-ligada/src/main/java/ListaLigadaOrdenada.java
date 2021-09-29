public class ListaLigadaOrdenada extends ListaLigada {
    
    ListaLigadaOrdenada ll = new ListaLigadaOrdenada();

    
    public void insereNode(int valor){
        Node anterior = ll.getHead();
        Node atual = ll.getHead().getNext();
        boolean inseriu = false;
        
        
        if(ll.getHead().getInfo() >= valor){
            
        }
        
        novoNode.setNext(ll.getHead().getNext());
        ll.getHead().setNext(novoNode);
    }
    
    public static void main(String[] args){
        
        
    }
    
}