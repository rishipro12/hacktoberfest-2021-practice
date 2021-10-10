class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}

//below function is used to insert nodes in the linked list
public static Node insert111(Node head, int val) {
        if(head == null) {
            return new Node(val);
        } else {
            Node cur;
            cur = insert111(head.next, val);
            head.next = cur;
            return head;
        }
    }


public static Node Merge (Node head1, Node head2){

    if(head1 == null) {
        return head2;
    }
    if(head2 == null) {
        return head1;
    }
        
    Node resultNode = null;

    while(head1 != null && head2 != null) {

        if(head1.val <= head2.val){
            if(resultNode == null){
                resultNode = insert111(head1, head1.val);
            }else{
                resultNode.next = insert111(head1, head1.val);
                resultNode = resultNode.next;
            }
            head1 = head1.next;
        }
        else{
            if(resultNode == null){
                resultNode = insert111(head2, head2.val);
            }else{
                resultNode.next = insert111(head2, head2.val);
                resultNode = resultNode.next;
            }
            head2 = head2.next;
        } 
    }

    while(head1 != null) {
        resultNode.next = insert111(head1, head1.val);
        head1 = head1.next;
    }
    
    while(head2 != null) {
        resultNode.next = insert111(head2, head2.val);
        head2 = head2.next;
    }

    return resultNode;
}
