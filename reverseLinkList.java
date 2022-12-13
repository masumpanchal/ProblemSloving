public class reverseLinkList {
    Node head;
    reverseLinkList(Node head){
        this.head = head;
    }


    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(Node node){
        Node current = head;
        while (current != null){
            if (current.next == null){
                current.next = node;
                break;
            }
            current = current.next;
        }
    }

    private void printLL() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
             n = n.next;
        }
        System.out.println("");
    }

    public void reverserl(){
        Node pointer = head;
        Node previous = null;
        Node current =  null;
        while (pointer!= null){
            current = pointer;
            pointer = pointer.next;

            //reverse the link
            current.next = previous;
            previous = current;
            head = current;
        }

    }

    public static void main(String [] args){
        reverseLinkList.Node head = new reverseLinkList.Node(1);
        reverseLinkList rl = new reverseLinkList(head);

        rl.add(new reverseLinkList.Node(2));
        rl.add(new reverseLinkList.Node(3));
        rl.printLL();


        rl.reverserl();
        rl.printLL();
    }
}

