package repository;

import domain.Aluno;
import storage.Node;
import storage.NodeStream;

import java.util.Collections;
import java.util.List;

public class AlunoRepository {

    private Node<Aluno> head;
    private Node<Aluno> tail;

    public AlunoRepository() {
        this.head = new Node<Aluno>(null);
        this.tail = this.head;
    }

    public List<Aluno> findAll() {
        return this.head.stream().toList();
    }

    public Aluno findByRA(String registro) {
        return this.head.stream()
                .filter((aluno) -> aluno.getRa().equals(registro))
                .
    }

    public List<Aluno> findByTurma(String turma) {
        return Collections.emptyList();
    }

    public boolean exists(Aluno aluno) {
        return false;
    }

    public boolean existsByRA(String registro) {
        return false;
    }

    public void saveAll(List<Aluno> alunos) {
    }

    public void save(Aluno aluno) {
        Node novoAluno = new Node(aluno);

        novoAluno.setNext(head.getNext());
        novoAluno.setPrevious(head);
        head.setNext(novoAluno);
        if(novoAluno.getNext() != null){
            novoAluno.getNext().setPrevious(novoAluno);
        }
    }

    public void delete(Aluno aluno) {
    }

    public void deleteAll() {
    }

    public int count() {
        return this.head.stream()
                .map(aluno -> 1)
                .reduce((acumulador, aluno) -> acumulador + aluno)
                .orElse(0);
    }

}
