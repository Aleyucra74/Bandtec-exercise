import java.util.Random;
import java.util.Scanner;

public class ExemploMatriz {

    public static void exibeMatriz(int[][] m){
        //exibe
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]+ "\t");
            }
            System.out.println();
        }
    }

    public static void matrizTransposta(int[][] m){
        for (int j = 0; j < m[0].length; j++) {
            for (int i = 0; i < m.length; i++) {
                System.out.print(m[i][j]+"\t");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //vetor normal
        int[] vetor = new int[10];
        
        //matriz bidimensional
        int[][] matriz = new int[3][4];

        int[][] matriz2 = {{1,2},{3,4},{5,6},{7,8}};

        int[][] matrizLOKA = {{1},{2,3,4,5},{6,7},{8,9,10}};

//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[i].length; j++) {
//                System.out.println(String.format("digite o valor de matriz[%d][%d]",i,j));
//                matriz[i][j] = (int) (Math.random()*(20-0+1)+0);
//            }
//        }

//        exibeMatriz(matriz);
//        System.out.println();
//        exibeMatriz(matriz2);
//        System.out.println();
//        exibeMatriz(matrizLOKA);
//        System.out.println();
        matrizTransposta(matriz2);

    }
    
}
