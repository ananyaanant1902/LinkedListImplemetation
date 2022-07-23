 //delete a node by value
   public static void deleteByValue(Node head, int value) {
       if (head.next == null) {
           if (head.data == value) {
               head = null;
           } else {
               System.out.println("Not Found");
           }
       }

       Node temp = head;
       Node prev = null;

       if (temp != null && temp.data == value) {
           head = temp.next;

       }
       else {
           while (temp != null && temp.data != value) {
               prev = temp;
               temp = temp.next;
           }

         
           if (temp == null)
               return;

           prev.next = temp.next;
       }
   }



       //delete by position
    public static void deleteBYPos(Node head, int pos) {
        int size = calcSize(head);
        Node temp = head;
        Node prev = null;
        while (--pos > 0) {
            prev = temp;
            temp = temp.next;
        }
   
        if (temp == null)
            return;
        prev.next = temp.next;
    }
