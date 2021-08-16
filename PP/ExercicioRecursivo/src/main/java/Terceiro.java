public class Terceiro {
    public static void rec(int[] numbers,int posicao, int sum){
        if(posicao == numbers.length){
            System.out.println("= "+sum);
        }
        if (posicao < numbers.length) {
            System.out.print(numbers[posicao] + "\t");
            if (numbers[posicao] % 2 == 0){
                rec(numbers, posicao+1, numbers[posicao]+sum);
            }
            rec(numbers, posicao+1, 0);
        }
    }
    public static void main(String[] args) {
        int[] vetor = {7,3,5,2};

        rec(vetor,0, 0);
    }
}
