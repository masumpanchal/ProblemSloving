public class LinkListCreation {
    public static void main(String[] args){
        LinkListCreation list = new LinkListCreation();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("List");
        list.printList();

        list.addFirst("this");
        list.printList();

    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    //--------------------------------AddFirst------------------------------

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    //--------------------------------AddLast--------------------------------

    public void addLast(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    //------------------------------Print--------------------------------------

    public void printList(){
        if (head == null){
            System.out.println("list is empty");
        }
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
}
