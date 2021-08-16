public class Sexto {

    public static int EuclidesIterativa(int NumeroNatural, int divisor){
        int resto = 0;
        do {
            if (NumeroNatural / divisor != 0) {
                resto = NumeroNatural % divisor;
            }
            resto = divisor % resto;
        }while (resto == 0);

        return resto;
    }

    public static int EuclidesRec(int NumeroNatural, int divisor){
        int resto =0;
        if(NumeroNatural % divisor == 0){
            return divisor;
        }else{
            resto = NumeroNatural % divisor;
            return EuclidesRec(divisor ,resto);
        }
    }


    public static void main(String[] args) {
//        System.out.println(90/54);
        System.out.println(EuclidesRec(90,54));
    }

}
