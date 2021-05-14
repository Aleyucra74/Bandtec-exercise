import java.util.Arrays;

public class ListaEstatica {

    private int[] vetor;
    private int nroElem;

    public ListaEstatica(int tam) {
        vetor= new int[tam];
        nroElem= 0;
    }

    public boolean adiciona(int valor) {
        if (nroElem >= vetor.length) {
            System.out.println("Lista está cheia");
            return false;
        }
        else {
            vetor[nroElem++] = valor;
            return true;
        }
    }

    public void exibe() {
        System.out.println("\nExibindo elementos da lista:");
        for (int i=0; i< nroElem; i++) {
            System.out.print(vetor[i] + "\t");
        }
        System.out.println();
    }

    public boolean subistitui(int valotAntigo, int novoValor){

        for (int i = 0; i < nroElem; i++) {
            if (vetor[i] == valotAntigo) {
                vetor[i] = novoValor;
                return true;
            }
        }
        return false;

    }

    public int contaOcorrencias (int valor){
        int valorRepetido=0;
        for (int i = 0; i < nroElem; i++) {
            if (vetor[i] == valor) {
                valorRepetido++;
            }
        }
        return valorRepetido;
    }

    public boolean adicionaNoInicio(int valor) {
        int[] a = new int[vetor.length];
        if (nroElem >= vetor.length) {
            System.out.println("Lista está cheia");
            return false;
        }else {
            for (int i = 1; i < a.length; i++) {
                a[0] = valor;
                a[i] = vetor[i-1];
            }
            vetor = Arrays.copyOf(a,nroElem);
            return true;
        }
    }

}
