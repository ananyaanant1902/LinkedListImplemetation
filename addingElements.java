
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedListImplementation{

    // add at the beginning
    public static Node addFirst(Node head, int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        return head;
    }
   //add at the end
    public static Node addLast(Node head, int data){
       Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return head;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            return head;
        }
    }

    //add by position
    public static void addByPosition(int position, int data,Node head){
        int size=calcSize(head);
        Node newNode =new Node(data);
        if(position>size ||position<0){
            System.out.println("IndexOutOfBound");
        }
        else{
            Node temp=head;
            while(--position>0) {
                temp = temp.next;
            }
                newNode.next=temp.next;
            temp.next=newNode;

        }
    }
  
    //size
    public static int calcSize(Node node){
        int size=0;
        while(node!=null){
            size++;
            node=node.next;
        }
        return size;
    }
    //print
    public static void display(Node node){
        while(node!=null){
            System.out.print(node.data+" ");
            node=node.next;
        }
        System.out.println();
    }
  
// examples
    public static void main(String[] args) {
        Node head = null;
        head = addFirst(head, 12);
        head = addFirst(head, 112);
        head = addFirst(head, 1122);
        head = addFirst(head, 11212);
        display(head);
        head = addLast(head, 12);
        head = addLast(head, 13);
        head = addLast(head, 14);
        display(head);
        System.out.println(calcSize(head));
        addByPosition(2,6,head);
        display(head);
    }
}
