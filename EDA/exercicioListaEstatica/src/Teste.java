public class Teste {

    public static void main(String[] args) {

        ListaEstatica vetor = new ListaEstatica(5);

        vetor.adiciona(10);
        vetor.adiciona(20);
        vetor.adiciona(20);
        vetor.adiciona(40);

        vetor.exibe();

        vetor.subistitui(40,400);

        vetor.exibe();

        System.out.println(
        vetor.contaOcorrencias(20));

        vetor.adicionaNoInicio(5);

        vetor.exibe();
    }

}
