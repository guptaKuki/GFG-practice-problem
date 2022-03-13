class GfG{
    void deleteNode(Node node) {
        //Add your code here
     if( node.next == null)
        node=null;
    node.data=node.next.data;
    node.next=node.next.next;
    }
}