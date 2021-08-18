public class Oitava {

    public static int ite(int digito){
        int valor =0;

        do{
            if (digito / 10 != 0) {
                valor += digito % 10;
                digito = digito/10;
            }
        }while(digito/10!=0);
        return valor;
    }

    public static int rec(int digito, int valor){
        int valorTotal=valor;
        if(digito / 10 == 0){
            return  valorTotal;
        }else if(digito / 10 != 0){
            valorTotal += digito % 10;
            digito = digito / 10;
            return rec(digito, valorTotal);
        }else {
            return rec(digito,valorTotal);
        }
    }

    public static void main(String[] args) {
        System.out.println(rec(132,0));
    }

}
