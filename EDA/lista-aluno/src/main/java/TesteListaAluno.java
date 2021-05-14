import java.util.Scanner;

public class TesteListaAluno {

    public static void main(String[] args) {

        Aluno aluno,aluno2;
        boolean fim=false;
        String nome;
        int ra;
        double nota;
        String[] opcoes = {"adicionar","exibir a lista","exibir um aluno da lista","limpar","fim"};

        ListaObj lista = new ListaObj(10);

//        aluno = new Aluno(11,"a",1.0);
//        aluno2 = new Aluno(22,"b",2.0);
//        lista.adiciona(aluno);
//        lista.adiciona(aluno2);
//        lista.exibe();
//        System.out.println(
//        lista.getElemento(1));

        Scanner n = new Scanner(System.in);
        Scanner r = new Scanner(System.in);
        Scanner no = new Scanner(System.in);
        Scanner s = new Scanner(System.in);

        while(!fim){

            for (int i = 0; i < opcoes.length; i++) {
                System.out.println((i+1)+". "+opcoes[i]);
            }
            String opcao = s.next();

            switch (opcao){
                case "1" :
                    System.out.println("adicionando aluno insira o ra, nome, nota");
                    ra = r.nextInt();
                    nome = n.next();
                    nota = no.nextDouble();
                    aluno = new Aluno(ra, nome, nota);
                    lista.adiciona(aluno);
                    break;
                case "2" :
                    System.out.println("exibindo os alunos");
                    lista.exibe();
                    break;
                case "3" :
                    System.out.println("busque um aluno pelo indice dele");
                    int indice = s.nextInt();
                    System.out.println(lista.getElemento(indice));
                    break;
                case "4" :
                    System.out.println("limpa a lista");
                    lista.limpa();
                    break;
                case "5" :
                    System.out.println("Fim");
                    fim = true;
                    break;
                default:
                    System.out.println("opcao invalida");
                    break;
            }

        }

    }

}
