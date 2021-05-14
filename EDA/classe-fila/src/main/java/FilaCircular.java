public class FilaCircular {

    int tamanho;
    String[] fila;
    int inicio;
    int fim;

    public FilaCircular(int tamanho) {
        this.fila = new String[tamanho];
        this.tamanho = 0;
        this.inicio = 0;
        this.fim = 0;
    }

    public boolean isEmpty(){ return tamanho == 0; }

    public boolean isFull(){ return fila.length == tamanho; }

    public void insert(String info){
        if (!isFull())
            this.fila[this.fim] = info;
            fim++;
            fim = fim % fila.length;
        tamanho++;
    }

    public String peek() { return this.fila[this.inicio]; }

    public String poll(){
        String primeiro = peek();

        if (!isEmpty()) {
            this.fila[this.inicio] = null;
            inicio++;
            inicio = inicio % fila.length;
            tamanho--;
        }
        return primeiro;
    }

    public void exibe(){
            int cont = 0;
            for (int i=inicio; cont < tamanho; i++) {
                System.out.println(fila[i]);
                i=i%fila.length;
                cont++;
            }
    }

}
