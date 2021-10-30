import java.util.List;

public class Teste {

    public static void main(String[] args) {

        Repositorio listaAlunos = new Repositorio();
        Aluno novoAluno = new Aluno("02201001","Alex","CCO");
        Aluno novoAluno2 = new Aluno("02201001","Alex2","CCO2");
        Aluno novoAluno3= new Aluno("02201002","Alex3","CCO2");
        Aluno novoAluno4 = new Aluno("02201001","Alex4","CCO4");

        listaAlunos.save(novoAluno);
        listaAlunos.save(novoAluno2);
        listaAlunos.save(novoAluno3);
        listaAlunos.save(novoAluno4);
        System.out.println(listaAlunos.count());
        listaAlunos.exibeListaDuplamente();
//        List<Aluno> lista = listaAlunos.findAll();
//        for (int i = 0; i < lista.size(); i++) {
//            System.out.println(lista.get(i).getNome());
//        }

//        Aluno aluno01 = listaAlunos.findByRA("02201002");
//        System.out.println(aluno01.getNome());

//        List<Aluno> lista01 = listaAlunos.findByTurma("CCO2");
//        for (int i = 0; i < lista01.size(); i++) {
//            System.out.println(lista01.get(i).getNome());
//        }

//        listaAlunos.delete(novoAluno3);
//        System.out.println(listaAlunos.count());
//        List<Aluno> lista = listaAlunos.findAll();
//        for (int i = 0; i < lista.size(); i++) {
//            System.out.println(lista.get(i).getNome());
//        }
    }

}
