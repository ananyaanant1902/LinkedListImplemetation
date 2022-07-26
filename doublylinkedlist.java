class Node{
    Node prev;
    int data;
    Node next;

    Node(int data){
    this.data=data;
    this.prev=null;
    this.next=null;
    }
}

//insert at begining

public class doublyLinkedList {
   public static Node addFirst(Node head,int data){

       Node newNode = new Node(data);
       newNode.next=head;
       if(head!=null){
           head.prev=newNode;
       }
       head=newNode;
       return head;
   }
  
  //insert last
  public static Node addLast (Node head, int data)
    {
        Node newNode = new Node (data);
        if (head == null)
        {
            head = newNode;
            return head;
        }

        Node temp = head;
        while (temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        return head;
    }
  
  //insert by position
   public static Node addPos(int pos, int data, Node head){
       Node newNode=new Node(data);
       Node temp=head;
       while(--pos>0){
           temp=temp.next;
       }
       newNode.next=temp.next;
       temp.next=newNode;
       newNode.prev=temp;
        if (newNode.next != null)
            newNode.next.prev = newNode;

       return head;
    }
  
  
   public static void main(String[] args) {
        Node head=new Node(10);
        head=addFirst(head,11);
        head=addFirst(head,12);
        head=addFirst(head,13);
        display(head);  // display of DLL is posted in another file
        
   }
}
