package exercicio;

public class Pilha<T> {

    int topo;
    T[] pilha;

    public Pilha(int pilha) {
        this.topo = -1;
        this.pilha = (T[]) new Object[pilha];
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public boolean isFull() {
        return (topo == pilha.length - 1) ? true : false;
    }

    public void push(T info) {
        if (!isFull()) {
            this.pilha[++this.topo] = info;
        } else {
            System.out.println("pilha cheia");
        }
    }

    public T pop() {
        return !isEmpty() ? this.pilha[this.topo--] : null;
    }

    public T peek() {
        return !isEmpty() ? this.pilha[this.topo] : null;
    }

    public void exibe() {
        for (int i = 0; i <= topo; i++)
            System.out.println(pilha[i]);
    }

    public Pilha<T> multiPop(int n) {
        Pilha<T> pilhaAux = new Pilha<T>(n);

        if (topo < n) {
            return null;
        }

        for (int i = 0; i < n; i++) {
            pilhaAux.push(pop());
        }

        return pilhaAux;
    }

    public void multiPush(Pilha<T> aux) {
//        while(!aux.isEmpty()){
//            this.push(aux.pop());
//        }
//        aux.exibe();
        for (int i = 0; i < aux.pilha.length; i++) {
            this.push(aux.pop());
        }
    }
}