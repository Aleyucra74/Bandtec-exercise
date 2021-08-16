public class Quarto {
    public static void rec(int[] numbers,int posicao, int sum){
        if (posicao < numbers.length) {
            System.out.print(numbers[posicao] + "\t");
            if (numbers[posicao] % 2 == 1){
                rec(numbers, posicao+1, sum+1);
            }
//            rec(numbers, posicao+1, 0);
        }
        if(posicao == numbers.length-1){
            System.out.println("= "+sum);
        }
    }
    public static void main(String[] args) {
        int[] vetor = {7,3,5,2};

        rec(vetor,0, 0);
    }
}
