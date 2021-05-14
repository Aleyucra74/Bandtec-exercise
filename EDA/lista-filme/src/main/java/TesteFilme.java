import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class TesteFilme {

    public static void gravaLista(ListaObj<Filme> lista, boolean isCSV, String nomeArquivo) {
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
                Filme filme = lista.getElemento(i);
                if (isCSV) {
                    saida.format("%d;%s;%.2f;%s;%d%n",filme.getIdFilme(),
                            filme.getNome(),filme.getNota(), filme.getGenero(), filme.getIdade());
                }
                else {
                    saida.format("%d %s %.2f %s %d%n",filme.getIdFilme(),
                            filme.getNome(),filme.getNota(), filme.getGenero(), filme.getIdade());
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
            System.out.printf("%-10s%-14s%-10s%-10s%7s\n","ID","NOME","NOTA", "GENERO", "IDADE" );
            while (entrada.hasNext()) {
                Integer id = entrada.nextInt();
                String nome = entrada.next();
                Double nota = entrada.nextDouble();
                String genero = entrada.next();
                Integer idade = entrada.nextInt();
                System.out.printf("%-10d%-14s%3.1f%-10d%-10d\n",id,nome,nota,genero,idade);  // 30.0
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

        Filme filme,filme2,filme3,filme4,filme5,filme6;
        boolean fim=true;
        Integer idFilme;
        Double nota;
        int idade;
        String nome, genero;

        String[] opcoes = {
                "adiciona um filme",
                "exibi a lista",
                "gravar a lista em arquivo csv",
                "Ler e exibir arquivo csv",
                "Gravar em outro arquivo csv apenas filmes que estao na lista, mas de uma determinado genero",
                "sair"
        };

        filme2 = new Filme(12,"b",4.0,"love",10);
        filme3 = new Filme(41,"c",7.0,"happy",21);
        filme4 = new Filme(53,"d",10.0,"+18",15);
        filme5 = new Filme(35,"e",8.0,"triste",11);
        filme6 = new Filme(23,"f",3.0,"love",16);

        ListaObj lista = new ListaObj(10);
        ListaObj listaGenero = new ListaObj(10);

        
        lista.adiciona(filme2);
        lista.adiciona(filme3);
        lista.adiciona(filme4);
        lista.adiciona(filme5);
        lista.adiciona(filme6);

        Scanner s = new Scanner(System.in);
        Scanner n = new Scanner(System.in);
        Scanner r = new Scanner(System.in);
        Scanner no = new Scanner(System.in);
        Scanner novoGenero = new Scanner(System.in);

        while(fim){

            for (int i = 0; i < opcoes.length; i++) {
                System.out.println((i+1)+". "+opcoes[i]);
            }

            String opcao = s.next();

            switch (opcao){
                case "1" :
                    System.out.println("adicionando aluno insira o id, nome, nota, genero, idade");
                    idFilme = r.nextInt();
                    nome = n.next();
                    nota = no.nextDouble();
                    genero = n.next();
                    idade = r.nextInt();

                    filme = new Filme(idFilme, nome, nota,genero,idade);
                    lista.adiciona(filme);
                    break;
                case "2" :
                    System.out.println("exibindo os filmes");
                    lista.exibe();
                    break;
                case "3" :
                    try{
                        if (lista.getTamanho() == 0)
                            throw new Exception("Lista esta vazia");
                        System.out.println("Gravando a lista num arquivo csv");
                        gravaLista(lista,true,"Filmes");
                        break;
                    } catch (Exception e){
                        System.out.println("erro"+ e);
                    }
                case "4" :
                    System.out.println("Ler e exibir arquivo csv");
                    leExibeArquivo(true,"Filmes");
                    break;
                case "5" :
                    System.out.println("Nova lista- defina o genero?");
                    String generoNovo = novoGenero.next();
                    try{
                        if (lista.getTamanho() == 0)
                            throw new Exception("Lista esta vazia");
                        System.out.println("Gravando a lista num arquivo csv");
                        listaGenero.novaListaGenero(lista,true,"FilmesGenero",generoNovo);
                        break;
                    } catch (Exception e){
                        System.out.println("erro"+ e);
                    }
                    break;
                case "6" :
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
