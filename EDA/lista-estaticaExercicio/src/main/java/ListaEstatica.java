public class ListaEstatica<T> {
    private int[] vetor;
    private int nroElem;

    public ListaEstatica(T tam) {
        vetor= new int[tam];
        nroElem= 0;
    }

    // Métodos

    // Método adiciona - recebe o valor a ser inserido na lista
    public boolean adiciona(int valor) {
        if (nroElem >= vetor.length) {          // Verifica se a lista está cheia
            System.out.println("Lista está cheia");
            return false;
        }
        else {
            vetor[nroElem++] = valor;           // Se não está, coloca o valor no vetor,
                                                // na posição nroElem e incrementa nroElem
            return true;
        }
    }


    // Método exibe - exibe os elementos da lista
    public void exibe() {
        System.out.println("\nExibindo elementos da lista:");
        for (int i=0; i< nroElem; i++) {        // Percorre enquanto i < nroElem
            System.out.print(vetor[i] + "\t");
        }
        System.out.println();
    }

    // Método busca - recebe um valor e verifica se esse valor está na lista
    // Se estiver, retorna o índice onde ele se encontra, senão retorna -1
    public int busca(int valor) {
        for (int i=0; i < nroElem; i++) {   // Percorre o vetor enquanto i < nroElem
            if (vetor[i] == valor) {        // Se elemento do vetor é o valor procurado
                return i;                   // então retorna seu índice
            }
        }
        return -1;          // se percorreu o vetor inteiro e não encontrou, retorna -1
    }

    // Método removePeloIndice - recebe o índice do valor a ser removido
    public boolean removePeloIndice(int indice) {
        if (indice < 0 || indice >= nroElem) {  // se índice for inválido
            return false;                       // retorna false
        }
        else {
            // Percorre o vetor a partir do indice recebido, sobrescrevendo
            // os valores
            for (int i=indice; i < nroElem-1; i++) {
                vetor[i] = vetor[i+1];
            }
            /* outra forma de fazer
            for (int i=indice+1; i < nroElem; i++) {
                vetor[i-1] = vetor[i];
            } */
            nroElem--;      // decrementa nroElem
            return true;    // retorna true
        }
    }

    // Método removeElemento - recebe o valor a ser removido
    // Remove a primeira ocorrência desse valor no vetor
    public boolean removeElemento(int valor) {
        // Utiliza o método busca para descobrir o índice do valor
        // e o método removePeloIndice para remover o valor pelo índice
        return removePeloIndice(busca(valor));
    }

}
