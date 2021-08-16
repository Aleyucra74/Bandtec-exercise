public class Quinto {

    public static int rec(int numbers[], int valorEncontrar, int posicao) {
        if (numbers.length == posicao) {
            return 0;
        } else if (numbers[posicao] == valorEncontrar) {
            return rec(numbers, valorEncontrar, posicao + 1) + 1;
        } else {
            return rec(numbers, valorEncontrar, posicao + 1);
        }
    }

    public static void main(String[] args) {
        int[] vetor = {7,3,5,3};

        System.out.println(rec(vetor,3,0));
    }

}
