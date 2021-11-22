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
        if(registro == null){
            throw new IllegalArgumentException();
        }

        return this.head.stream()
                .filter((aluno) -> aluno.getRa().equals(registro))
                .toNodeTail().getValue();
    }

    public List<Aluno> findByTurma(String turma) {
        if(turma == null){
            throw new IllegalArgumentException();
        }

        return head.stream()
                .filter((aluno) -> turma.equals(aluno.getTurma()))
                .toList();
    }

    public boolean exists(Aluno aluno) {
        if(aluno == null){
            throw new IllegalArgumentException();
        }

        return this.head.stream()
                .anyMatch(item -> item.equals(aluno));
    }

    public boolean existsByRA(String registro) {
        if(registro == null){
            throw new IllegalArgumentException();
        }
        return this.head.stream()
                .anyMatch(item -> item.getRa().equals(registro));
    }

    public void saveAll(List<Aluno> alunos) {
        if(alunos == null){
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < alunos.size(); i++) {
            if(exists(alunos.get(i))){
                i = i + 1;
            }
            save(alunos.get(i));
        }
    }

    public void save(Aluno aluno) {
        if(aluno == null || findByRA(aluno.getRa()) != null ){
            throw new IllegalArgumentException();
        }

        Node novoAluno = new Node(aluno);

        novoAluno.setNext(head.getNext());
        novoAluno.setPrevious(head);
        head.setNext(novoAluno);
        if(novoAluno.getNext() != null){
            novoAluno.getNext().setPrevious(novoAluno);
        }
    }

    public void delete(Aluno aluno) {
        if(aluno == null || !exists(aluno)){
            throw new IllegalArgumentException();
        }

        Node anterior = head;
        Node atual = head.getNext();

        while (atual != null){
            if(atual.getValue().equals(aluno)){
                anterior.setNext(atual.getNext());
                atual.getNext().setPrevious(anterior);
                break;
            }else{
                anterior = atual;
                atual = atual.getNext();
            }
        }
    }

    public void deleteAll() {
        this.head.setNext(null);
    }

    public int count() {
        return this.head.stream()
                .map(aluno -> 1)
                .reduce((acumulador, aluno) -> acumulador + aluno)
                .orElse(0);
    }

}
