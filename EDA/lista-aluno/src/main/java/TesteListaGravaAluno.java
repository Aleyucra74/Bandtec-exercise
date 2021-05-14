import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TesteListaGravaAluno {

    public static void gravaLista(ListaObj<Aluno> lista, boolean isCSV, String nomeArquivo) {
        FileWriter arq = null;
        Formatter saida = null;
        boolean deuRuim = false;

        if (isCSV) {
            nomeArquivo += ".csv";
        }
        else {
            nomeArquivo += ".txt";
        }

        try {
            arq = new FileWriter(nomeArquivo, true);
            saida = new Formatter(arq);
        }
        catch (IOException erro) {
            System.err.println("Erro ao abrir arquivo");
            System.exit(1);
        }

        try {
            for (int i=0; i< lista.getTamanho(); i++) {
                Aluno aluno = lista.getElemento(i);
                if (isCSV) {
                    saida.format("%d;%s;%.2f%n",aluno.getRa(),
                            aluno.getNome(),aluno.getNota());
                }
                else {
                    saida.format("%d %s %.2f%n",aluno.getRa(),
                            aluno.getNome(),aluno.getNota());
                }
            }
        }
        catch (FormatterClosedException erro) {
            System.err.println("Erro ao gravar no arquivo");
            deuRuim= true;
        }
        finally {
            saida.close();
            try {
                arq.close();
            }
            catch (IOException erro) {
                System.err.println("Erro ao fechar arquivo.");
                deuRuim = true;
            }
            if (deuRuim) {
                System.exit(1);
            }
        }
    }

    public static void leExibeArquivo(boolean isCSV, String nomeArquivo) {
        FileReader arq= null;
        Scanner entrada = null;
        boolean deuRuim= false;

        if (isCSV) {
            nomeArquivo += ".csv";
        }
        else {
            nomeArquivo += ".txt";
        }

        try {
            arq = new FileReader(nomeArquivo);
            if (isCSV) {
                entrada = new Scanner(arq).useDelimiter(";|\\r\\n");
            }
            else {
                entrada = new Scanner(arq);
            }
        }
        catch (FileNotFoundException erro) {
            System.err.println("Arquivo não encontrado");
            System.exit(1);
        }

        try {
            System.out.printf("%-10s%-14s%7s\n","RA","NOME","NOTA" );
            while (entrada.hasNext()) {
                Integer ra = entrada.nextInt();
                String nome = entrada.next();
                Double nota = entrada.nextDouble();
                System.out.printf("%-10d%-14s%3.1f\n",ra,nome,nota);  // 30.0
            }
        }
        catch (NoSuchElementException erro)
        {
            System.err.println("Arquivo com problemas.");
            deuRuim = true;
        }
        catch (IllegalStateException erro)
        {
            System.err.println("Erro na leitura do arquivo.");
            deuRuim = true;
        }
        finally {
            entrada.close();
            try {
                arq.close();
            }
            catch (IOException erro) {
                System.err.println("Erro ao fechar arquivo.");
                deuRuim = true;
            }
            if (deuRuim) {
                System.exit(1);
            }
        }
    }

    public static void main(String[] args) {

        Aluno aluno,aluno2,aluno3,aluno4,aluno5,aluno6;
        boolean fim=true;
        String[] opcoes = {"Gravar a lista num arquivo txt","Gravar a lista num arquivo csv","Ler e exibir arquivo txt","Ler e exibir arquivo csv","fim"};

        aluno = new Aluno(11,"a",1.0);
        aluno2 = new Aluno(12,"b",4.0);
        aluno3 = new Aluno(41,"c",7.0);
        aluno4 = new Aluno(53,"d",10.0);
        aluno5 = new Aluno(35,"e",8.0);
        aluno6 = new Aluno(23,"f",3.0);

        ListaObj lista = new ListaObj(10);

        lista.adiciona(aluno);
        lista.adiciona(aluno2);
        lista.adiciona(aluno3);
        lista.adiciona(aluno4);
        lista.adiciona(aluno5);
        lista.adiciona(aluno6);

        Scanner s = new Scanner(System.in);

        while(fim){

            for (int i = 0; i < opcoes.length; i++) {
                System.out.println((i+4)+". "+opcoes[i]);
            }
            String opcao = s.next();

            switch (opcao){
                case "4" :
                    try{
                        if (lista.getTamanho() == 0)
                            throw new Exception("Lista esta vazia");
                        System.out.println("Gravando a lista num arquivo txt");
                        gravaLista(lista,false,"alunos");
                        break;
                    }catch (Exception e){
                        System.out.println("errp"+ e);
                    }
                case "5" :
                    try{
                        if (lista.getTamanho() == 0)
                            throw new Exception("Lista esta vazia");
                        System.out.println("Gravando a lista num arquivo csv");
                        gravaLista(lista,true,"alunos");
                        break;
                    } catch (Exception e){
                        System.out.println("errp"+ e);
                    }
                case "6" :
                    System.out.println("Ler e exibir arquivo txt");
                    leExibeArquivo(false,"alunos");
                    break;
                case "7" :
                    System.out.println("Ler e exibir arquivo csv");
                    leExibeArquivo(true,"alunos");
                    break;
                case "8" :
                    System.out.println("Fim");
                    fim = false;
                    break;
                default:
                    System.out.println("opcao invalida");
                    break;
            }

        }

    }

}
