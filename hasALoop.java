public class hasALoop {
    public static void main(String[] args){
        LinkedList linklist = new LinkedList();
        linklist.appendIntoTail(new LinkedList.Node("101"));
        LinkedList.Node cycle = new LinkedList.Node("201");
        linklist.appendIntoTail(cycle);
        linklist.appendIntoTail(new LinkedList.Node("301"));
        linklist.appendIntoTail(new LinkedList.Node("401"));
        linklist.appendIntoTail(cycle);
        //System.out.println("Linked List : " + linklist);

        if (linklist.isCyclic()){
            System.out.println("LinkedList is cyclic as it contains cycle or loop.");
        }
        else {
            System.out.println("LinkedList is not cyclic, no loops or cycle found.");
        }

        //linklist.detectCycle();
        //System.out.println("loop starting Node is: " + linklist.detectfirstNode());

    }
}

 class LinkedList {
    public Node head;
    public LinkedList() {this.head = new Node("head");}
     public Node head() { return head; }
     public static class Node {
         private String data;
         private Node next;

         public Node(String data) {
             this.data = data;
         }
         public String data() {return data;}
         public void setData(String data) {this.data = data;}

         public Node next() {return next;}
         public void setNext(Node next) {
             this.next = next;
         }

         @Override
         public String toString(){
             return this.data;
         }
     }

     //--------------------------------AppendInto Tail---------------------------------------
     public void appendIntoTail(Node node){
         Node current = head;

         //Fnd the last element of linkedList i.e. tail
         while (current.next != null){
             current = current.next;
         }

         //append new node to tail in LinkedList
         current.setNext(node);
     }

     //--------------------------------------------Cyclic method-----------------------------------

     public boolean isCyclic(){
         Node fast = head;
         Node slow = head;

         while ( fast != null && fast.next != null){
             fast = fast.next.next;
             slow = slow.next;

             //If fast and slow pointer are meeting then is a cyclic LinkedList

             if (fast == slow) {
                 return true;
             }
         }
         return false;
     }



     @Override
     public String toString(){
         StringBuilder sb = new StringBuilder();
         Node current = head.next;
         while (current != null){
             sb.append(current).append("-->");
             current = current.next;
         }
         sb.delete(sb.length() - 3, sb.length()); // to remove --> from last node
         return sb.toString();
     }

     //------------------------------------- 2nd method of detection of Cyclic---------------------------------------

     /*Node detectCycle(){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = head.next;
            fast = head.next.next;

            if (slow == fast){
                return slow;
            }
        }
         return null;
     }

     //------------------------------------ for detection of first node of loop----------------------------------

     Node detectfirstNode(){

        Node meet = detectCycle();
        Node start = head;
        while (start != meet){
            start = start.next;
            meet = meet.next;
        }
         return start;
     }*/

}
