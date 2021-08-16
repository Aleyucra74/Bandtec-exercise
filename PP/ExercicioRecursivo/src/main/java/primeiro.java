public class primeiro {

    public static int recursivo(int n){
        if(n == 0){
            return n;
        }else{
            System.out.println(n);
            return n + recursivo(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(recursivo(5));

    }

}
