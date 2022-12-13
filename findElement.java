public class findElement {
    private ListNode head;
    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void insetBeginning(int data){
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    public void printLinklist(){
        if (head == null){
            System.out.println("null");
        }
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + "--->");
            current = current.next;
        }
        System.out.println("null");
    }

    //----------------------Find 3rd element--------------------------
    public ListNode getElement(int n){
        if (head == null){
            return null;
        }
        if ( n <= 0){
            throw new IllegalArgumentException("Invalid value n: = " + n);
        }
        ListNode mainpntr = head;
        ListNode refpntr = head;
        int count =0;
        //-----------------------for Iteration of refpntr----------
        while (count < n){

            if (refpntr == null){
                throw new IllegalArgumentException();
            }

            refpntr = refpntr.next;
            count++;
        }
        //----------------------for both pointer-------------------
        while (refpntr != null){
            refpntr = refpntr.next;
            mainpntr = mainpntr.next;
        }
        return mainpntr;
    }

    public static void main(String[] args){
        findElement fe = new findElement();
        // Insert elemet

        fe.insetBeginning(15);
        fe.insetBeginning(11);
        fe.insetBeginning(1);
        fe.insetBeginning(8);
        fe.insetBeginning(10);

        fe.printLinklist();

        ListNode nthNodeFromEnd = fe.getElement(3);
        System.out.println("3rd element from end is : " + nthNodeFromEnd.data);
    }
}
