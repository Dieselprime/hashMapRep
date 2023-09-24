

public class List {

    private Node head;
    private int size;

    public List(Node head) {

        this.head = head;
    }

    public int mean(int mean, Node tmp){

        if(tmp == null) {
            tmp = head;
        }
        if(tmp.getNext() == null){
            return mean/size;
        }
        mean += tmp.getInfo();
        size++;
        return mean(mean, tmp.getNext());

    }
}
