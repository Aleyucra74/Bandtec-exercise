public class Fila {

    int tamanho;
    String[] fila;

    public Fila(int tamanho) {
        this.tamanho = 0;
        this.fila = new String[tamanho];
    }

    public boolean isEmpty(){ return tamanho == 0; }

    public boolean isFull(){ return fila.length == tamanho; }

    public void insert(String info ){
        if (!isFull())
            this.fila[this.tamanho++] = info;
    }

    public String peek(){ return fila[0]; }

    public String poll(){
        String primeiro = peek();

        if (!isEmpty()){
            for (int i = 0; i < tamanho-0; i++) {
                fila[i] = fila[i+1];
            }
            fila[tamanho-1]=null;
            tamanho--;
        }
        return primeiro;
    }

    public void exibe() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(fila[i]);
        }
    }

}
