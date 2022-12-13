public class MyLinkedListClass {
    Node head;
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
   //------------------------------------ Add Method ------------------------
    public void add(int data){
        Node toInsert = new Node(data);
        if (head == null){
            head=toInsert;
            return;
        }
        Node temp = head;

        while (temp.next != null){
            temp = temp.next;
        }
        temp.next=toInsert;
    }
    //--------------------------------- Prtint List -----------------------
    public void print(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+ "-->");
            temp=temp.next;
        }
    }
    public static void main(String[] args){
    MyLinkedListClass linkedList = new MyLinkedListClass();
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);
    linkedList.add(4);
    linkedList.add(5);
    linkedList.add(6);

    linkedList.print();
    System.out.println();
    linkedList.findMiddle();

    }

    public void findMiddle(){
        Node slowPointer = head;
        Node fastPointer= head;

        while (fastPointer != null && fastPointer.next != null){
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }
        System.out.println(slowPointer.data);
    }
}

