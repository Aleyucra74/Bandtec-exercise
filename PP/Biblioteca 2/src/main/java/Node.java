public class Node {

    private Aluno aluno;
    private Node next;
    private Node prev;

    public Node(Aluno aluno) {
        this.aluno = aluno;
        this.next = null;
        this.prev = null;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
