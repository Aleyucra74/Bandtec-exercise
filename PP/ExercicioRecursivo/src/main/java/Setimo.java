public class Setimo {

    public static int MaiorValorVetorIterativo(int[] vetor){
        int valorMaximo = vetor[0];
        for(int i =0; i < vetor.length;i++){
            if(vetor[i]>valorMaximo){
                valorMaximo=vetor[i];
            }
        }
        return valorMaximo;
    }

    public static int MaiorValorVetorRecursivo(int[] vetor; int posicao){
        int valorMaximo=vetor[posicao];
        if(vetor[posicao]>valorMaximo){
            valorMaximo=vetor[posicao];
            MaiorValorVetorRecursivo(vetor,posicao+1);
        }else{
            MaiorValorVetorRecursivo(vetor,posicao+1);
        }
    }


    public static void main(String[] args){
        int[] vetor= {1,3,52,1,55,56};

        System.out.println(MaiorValorVetorRecursivo(vetor,0));
    }
    

}