public class Teste {

    public static void main(String[] args) {

        /*Fila filaTeste = new Fila(4);

        filaTeste.insert("A");
        filaTeste.insert("B");
        filaTeste.insert("C");

        filaTeste.exibe();

        filaTeste.poll();*/

        FilaCircular filaCircular = new FilaCircular(5);

        filaCircular.insert("1");
        filaCircular.insert("2");
        filaCircular.insert("3");
        filaCircular.insert("4");
        filaCircular.insert("5");

        filaCircular.exibe();
        System.out.println();

        System.out.println(filaCircular.poll());

        System.out.println();
        filaCircular.exibe();

    }

}
