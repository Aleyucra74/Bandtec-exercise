package hashing;

public class Hashing {

    ListaLigada[] tab;

    public Hashing(int numero){
        this.tab = new ListaLigada[numero];
        inicializa();
    }
    
    public void inicializa(){
        for(int i = 0; i < tab.length; i++){
            this.tab[i] = new ListaLigada();
        }
    }
    
    public int funcaoHash(int X){
        return X % this.tab.length;
    }
    
    public void insere(int X){
        int entrada = funcaoHash(X);
        this.tab[entrada].insereNode(X);
    }
    
    public boolean busca(int X){
        if(this.tab[funcaoHash(X)].buscaNode(X) == null){
            return false;
        }
        return true;
    }
    
    public boolean remove(int X){
        if(this.tab[funcaoHash(X)].buscaNode(X) == null){
            return false;
        }
        this.tab[funcaoHash(X)].removeNode(X);
        return true;
    }

}
