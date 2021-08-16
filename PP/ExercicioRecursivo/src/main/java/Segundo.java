public class Segundo {

    public static void rec(int[] numbers,int posicao, int sum){
        if(posicao == numbers.length){
            System.out.println("= "+sum);
        }
        if (posicao < numbers.length) {
            System.out.print(numbers[posicao] + "\t");
            rec(numbers, posicao+1, numbers[posicao]+sum);
        }
    }
    public static void main(String[] args) {
        int[] vetor = {7,3,5,2};

        rec(vetor,0, 0);
    }

}
