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
                .filter((aluno) -> aluno.getTurma().equals(turma))
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

        alunos.forEach(aluno -> {
            try {
                save(aluno);
            }catch (IllegalArgumentException e){}
        });
    }

    public void save(Aluno aluno) {
        if(aluno == null || exists(aluno) ){
            throw new IllegalArgumentException();
        }
        tail.setNext(new Node<>(aluno));
        tail = tail.getNext();
    }

    public void delete(Aluno aluno) {
        if(aluno == null || !exists(aluno)){
            throw new IllegalArgumentException();
        }

        Node<Aluno> atual = head;
        while (atual.getNext() != null){
            if(atual.getNext().getValue().equals(aluno)){
                atual.setNext(atual.getNext().getNext());
                break;
            }else{
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
