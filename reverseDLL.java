//Reverse a Doubly Linked List 

static Node reverseList(Node head)
    {
        Node left = head, right = head;


        while (right.next != null) {
            right = right.next;
        }
      

        while (left!=right && left.prev!=right){
            int t = left.data;
            left.data = right.data;
            right.data = t;

            left = left.next;

            right = right.prev;
       
        }
        return head;
    }


//or by using size
 static Node reverseList(Node head)
    {
        Node left = head, right = head;


        while (right.next != null) {
            right = right.next;
        }
     
        int size=calcSize(head)/2;
        while (size>0 && left.next!=null)
        {
            int t = left.data;
            left.data = right.data;
            right.data = t;

            left = left.next;

            right = right.prev;
            size--;
        }
        return head;
    }
