public class ListaLigadaOrdenada extends ListaLigada {
    
    ListaLigada ll = new ListaLigada();

    public void exibeRec(Node posicao){
        if (posicao.getNext() != null){
            exibeRec(posicao.getNext());
        }
        System.out.println(posicao.getInfo());
    }

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

    public Node buscarNodeRec(int valor, Node posicao){
        if(posicao.getInfo() > valor){
            return posicao;
        }
        Node value = buscarNodeRec(valor, posicao.getNext());
        return value;
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

    public boolean removeNodeRec(int valor , Node posicao){
        Node anterior = posicao;
        if(posicao.getInfo() == valor){
            anterior.setNext(posicao.getNext());
            return true;
        }
        return removeNodeRec(valor, posicao.getNext());
    }

    public void concatena(ListaLigada lista){
        Node atual = ll.getHead().getNext();
        while (atual != null){
            if(atual.getNext() == null){
                atual.setNext(lista.getHead().getNext());
                return;
            }else{
                atual = atual.getNext();
            }
        }
    }

    public boolean compara(ListaLigada lista){
        Node atual = ll.getHead().getNext();
        Node novaLista = lista.getHead().getNext();
        boolean igual = false;
        while (atual != null){
            if(atual.getInfo() != novaLista.getInfo()){
                igual = false;
            }else{
                igual = true;
            }
            // igual = (atual.getInfo() != novaLista.getInfo()) ? false : true;
            novaLista = novaLista.getNext();
            atual = atual.getNext();
        }
        return igual;
    }

    public void inverte(){
//        Node atual = ll.getHead().getNext();
//        Node anterior = ll.getHead();
//        int valor = atual.getInfo();
//        while (atual != null){
//            if(atual.getNext() == null){
//                atual.setNext(ll.getHead().getNext());
//                ll.getHead().setNext(atual);
//                anterior.setNext(null);
//                if(valor == anterior.getInfo()){
//                    break;
//                }
//            }
//            anterior = atual;
//            atual = atual.getNext();
//        }
        ListaLigada novaLista = new ListaLigada();
        Node atual = ll.getHead().getNext();
        while (atual != null){
            Node novoValor = ll.buscaNode(atual.getInfo());
            novaLista.insereNode(novoValor.getInfo());
            atual = atual.getNext();
        }

        Node atualNovaLista = novaLista.getHead().getNext();
        while (atualNovaLista != null){
            System.out.print(atualNovaLista.getInfo()+ " ");
            atualNovaLista = atualNovaLista.getNext();
        }

    }

    public int getTamanhoRec(Node posicao){
        int tamanho = 0;
        if(posicao.getNext() != null){
             tamanho = getTamanhoRec(posicao.getNext()) + 1;
        }
        return tamanho;
    }

    public static void main(String[] args){

//        ListaLigadaOrdenada lista = new ListaLigadaOrdenada();
//
//        lista.insereNode(1);
//        lista.insereNode(10);
//        lista.insereNode(2);
//        lista.ll.exibe();
//        System.out.println("================");
////        Node valor = lista.buscaNode(1);
////        System.out.println(valor.getInfo());
////
////        System.out.println("================");
//        ListaLigada listaConcat = new ListaLigada();
//        listaConcat.insereNode(3);
//        listaConcat.insereNode(4);
//        listaConcat.exibe();
//        lista.concatena(listaConcat);
//
//        System.out.println("================");
//        lista.ll.exibe();

//        System.out.println("=================");
//        ListaLigadaOrdenada listaUm = new ListaLigadaOrdenada();
//        listaUm.insereNode(1);
//        listaUm.insereNode(2);
//        listaUm.insereNode(3);
//        listaUm.insereNode(4);
//        listaUm.ll.exibe();
//        System.out.println("\n===========");

//        ListaLigada listaDois = new ListaLigada();
//        listaDois.insereNode(4);
//        listaDois.insereNode(3);
//        listaDois.exibe();
//        listaUm.inverte();

        ListaLigadaOrdenada lista = new ListaLigadaOrdenada();
        lista.insereNode(1);
        lista.insereNode(2);
        lista.insereNode(3);
        lista.insereNode(4);
        lista.exibeRec(lista.ll.getHead());
        Node valor = lista.buscarNodeRec(3,lista.ll.getHead());
        System.out.println(valor.getInfo());

        System.out.println("=-============");
        System.out.println(lista.removeNodeRec(3,lista.ll.getHead()));
        System.out.println(lista.getTamanhoRec(lista.ll.getHead()));
    }
    
}