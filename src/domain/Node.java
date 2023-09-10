package domain;

public class Node {
    private String value;
    private Node next;


    public Node(final String value) {
        this.value = value;
    }

    public Node(final String value, final Node next) {
        this.value = value;
        this.next = next;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value){
        this.value = value;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node node) {
        this.next = node;
    }

    @Override
    public String toString() {
        return this.value + " --> ";
    }
}