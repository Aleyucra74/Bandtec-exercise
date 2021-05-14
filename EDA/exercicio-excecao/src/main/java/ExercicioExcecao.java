import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercicioExcecao {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int salario = 0, reajuste = 0;
        boolean r = true;


        while(r){
            try{
                System.out.println("um valor para salario:");
                salario = s.nextInt();
                if (salario < 0)
                    throw new Exception("salario deve ser maior q 0");

                System.out.println("um valor para reajuste(0 a 100):");
                reajuste = s.nextInt();
                if (reajuste < 0 || reajuste > 100)
                    throw new Exception("valores fora do limite(0 a 100)");

                System.out.println(String.format("valor do reajuste: %d - %d = %d",salario,reajuste,(salario-reajuste)));
                r = false;
            }catch (InputMismatchException e){
                System.out.println("erro: " + e);
                s.nextLine();
                System.out.println("digite um nmr, pf");
            }catch (Exception e){
                System.out.println("erro: " + e);
            }
        }

    }

}
