/*
* Implementing Linked List:
* Steps:-
* 1. Creating a node class which has two fields:
*          a. Data and b. Next(pointer/reference)
* 2. Creating a class LinkedList (or any name)
*    creating a field head of type Node, thus having null pointer to it
* 3. In the main function we can make 1 linkedlist object
*    and add the first data to it's head
* 4. After that creating few nodes for the same and make each other's pointers to refer to next one till
*    last one where the pointer will refer to null.
* 
* 
* //////////
* For printing we make a function with the name display and run a while loop
* in which the untill the head is not null, we will print  it and move forward
* 
* ///////////
* quick note: 
* Keep the functions and classes on default to avoid the static/non-static error
*
* */
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class LinkedListImplementation{
    Node head;
    public void display() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args){
       LinkedListImplementation ll=new LinkedListImplementation();
       ll.head=new Node(12);
       Node l2=new Node(14);
       Node l3=new Node(16);
       ll.head.next=l2;
       l2.next=l3;
       ll.display();

    }
}
