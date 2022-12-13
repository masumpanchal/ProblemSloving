import java.util.LinkedList;

public class lengthLL {
    private Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<String>();

        //add elements in linkedlist

        list.add("1");
        list.add("2");
        list.add("26");
        list.add("17");
        list.add("56");

        System.out.println("LinkedList : " + list);

        System.out.println("Size of LinkedList " + list.size());

        lengthLL ll = new lengthLL();
        System.out.println(ll.lengthI());
        System.out.println(ll.lengthr(null));

    }

    public int lengthI(){
        int count = 0;
        Node current =  this.head;

        while (current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public int lengthr(Node current){

        if (current == null) {
            return 0;
        }
        return 1+lengthr(current.next);
    }
}
