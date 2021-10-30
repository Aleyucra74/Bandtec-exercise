import java.util.ArrayList;
import java.util.List;

public class Repositorio {

    private Node head;

    public Repositorio(){
        this.head = new Node(null);
    }

    public List<Aluno> findAll(){
        List<Aluno> listaAlunos = new ArrayList<Aluno>(count());
        Node atual = head.getNext();

        while (atual != null){
            listaAlunos.add(atual.getAluno());
            atual = atual.getNext();
        }

        return listaAlunos;
    }

    public Aluno findByRA(String registro){
        Aluno alunoEncontrado = null;
        Node atual = head.getNext();

        while (atual != null) {
            if(atual.getAluno().getRa().equals(registro)){
                alunoEncontrado = new Aluno(
                        atual.getAluno().getRa(),
                        atual.getAluno().getNome(),
                        atual.getAluno().getTurma()
                );
                break;
            }
            atual = atual.getNext();
        }

        return alunoEncontrado;
    }

    public List<Aluno> findByTurma(String turma){
        List<Aluno> listaAlunosEncontradoTurma = new ArrayList<Aluno>(count());
        Node atual = head.getNext();

        while (atual != null){
            if(atual.getAluno().getTurma().equals(turma)){
                listaAlunosEncontradoTurma.add(atual.getAluno());
            }
            atual = atual.getNext();
        }

        return listaAlunosEncontradoTurma;
    }

    public void saveAll(List<Aluno> alunos){
        for (int i = 0; i < alunos.size(); i++) {
            save(alunos.get(i));
        }
    }

    public void save(Aluno aluno){
        Node novoAluno = new Node(aluno);

        novoAluno.setNext(head.getNext());
        novoAluno.setPrev(head);
        head.setNext(novoAluno);
        if(novoAluno.getNext() != null){
            novoAluno.getNext().setPrev(novoAluno);
        }
    }

    public void deleteAll(){
        head.setNext(null);
    }

    public void delete(Aluno aluno){
        Node anterior = head;
        Node atual = head.getNext();

        while (atual != null){
            if(atual.getAluno().equals(aluno)){
                anterior.setNext(atual.getNext());
                atual.getNext().setPrev(anterior);
                return;
            }else{
                anterior = atual;
                atual = atual.getNext();
            }
        }
    }

    public int count(){
        Node atual = head.getNext();
        int tamanho = 0;
        while (atual != null){
            tamanho = tamanho +1;
            atual = atual.getNext();
        }
        return tamanho;
    }

    public boolean exists(Aluno aluno) {
        Node atual = head.getNext();

        while(atual != null) {
            if (atual.getAluno().equals(aluno)) return true;
            atual = atual.getNext();
        }
        return false;
    }

    public boolean existsByRA(String registro){
        Node atual = head.getNext();
        while (atual != null){
            if (atual.getAluno().getRa().equals(registro)) return true;
            atual = atual.getNext();
        }
        return false;
    }

    public void exibeListaDuplamente()
    {
        Node ultimo = null;
        Node atual = head.getNext();
        System.out.println("Lista na Ordem next");
        while (atual != null) {
            System.out.print(atual.getAluno().getNome() + ", " + atual.getAluno().getRa() + ", " + atual.getAluno().getTurma() + "\n");
            ultimo = atual;
            atual = atual.getNext();
        }
        System.out.println();
        System.out.println("Lista na ordem prev");
        while (ultimo != null) {
            System.out.print(ultimo.getAluno().getNome() + ", " + ultimo.getAluno().getRa() + ", " + ultimo.getAluno().getTurma() + "\n");
            ultimo = ultimo.getPrev();
        }
    }

}
