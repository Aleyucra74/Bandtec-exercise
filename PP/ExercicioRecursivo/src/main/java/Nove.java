public class Nove {

    public static String iteBin(int valor){
        String valorBin ="";

        while (valor>0){
            if (valor% 2 ==1){
                valorBin += "1";
            }else {
                valorBin += "0";
            }
            valor= valor/2;
        }

        return valorBin;
    }

//    public static int recBin(){}

    public static void main(String[] args) {
        System.out.println(new StringBuilder(iteBin(12)).reverse().toString());
//        System.out.println(12/2);
        System.out.println(12%2);
    }

}
