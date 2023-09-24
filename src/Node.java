public class Node {

    private double info;
    private Node next;

    public double getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Node(int info, Node next) {
        this.info = info;
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
