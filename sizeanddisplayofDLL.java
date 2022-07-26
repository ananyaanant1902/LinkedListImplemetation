
//size
public static int calcSize(Node node){
       int size=0;
       while(node!=null){
           size++;
           node=node.next;
       }
       return size;
   }
//display
    public static void display(Node node)
    {
        Node last = node;
        System.out.println("Traversal in forward Direction");
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("Traversal in reverse direction");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
        System.out.println();
    }
