
    //size
    public static int calcSize(Node node){
        int size=0;
        while(node!=null){
            size++;
            node=node.next;
        }
        return size;
    }
