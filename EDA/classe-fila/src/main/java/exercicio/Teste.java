package exercicio;

public class Teste {

    public static void main(String[] args) {

        int[] nmrs = {2,-1,2,-31,3,23,-23,2,312,-41,2312,-3};

//        Fila<Integer> filaUm = new Fila<>(10);
//        Fila<Integer> filaDois = new Fila<>(10);
//
//        for (int i = 0; i < nmrs.length; i++) {
//            if (nmrs[i] > 0) {
//                filaUm.insert(nmrs[i]);
//            }else {
//                filaDois.insert(nmrs[i]);
//            }
//        }
//
//        for (int j = 0; j < (filaUm.tamanho+filaDois.tamanho); j++) {
//            System.out.println(filaUm.poll());
//        }
//        for (int i = 0; i < (filaUm.tamanho+filaDois.tamanho); i++) {
//            System.out.println(filaDois.poll());
//        }

        /////////////////

        Pilha<Integer> integerPilha = new Pilha<>(20);
        Fila<Integer> integerFila = new Fila<>(20);

        for (int i = 0; i < nmrs.length; i++) {
            if (nmrs[i] > 0) {
                integerPilha.push(nmrs[i]);
            }else {
                integerFila.insert(nmrs[i]);
            }
        }

        int topo = integerPilha.topo;
        int tamanho = integerFila.tamanho;
        Fila<Integer> aux = new Fila<>(tamanho);
        for (int i = 0; i <= topo; i++) {
            System.out.println(integerPilha.pop());
        }

        for (int i = 0; i < tamanho; i++) {
            integerPilha.push(integerFila.poll());
            System.out.println(integerPilha.peek());
            integerPilha.pop();
        }

    }

}
