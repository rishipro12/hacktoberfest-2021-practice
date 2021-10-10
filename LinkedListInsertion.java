 public Node insertFirst(int data){
	Node temp = new Node(data);
		if(head == null){
		   head = temp;
		}
		else{
		  temp.next = head;
		  head = temp;
		}
	return head;
}


 public Node insertLast(int data){
	Node temp = new Node(data);
	if(head == null){
		head = temp;
	}
	else{
		Node current = head;
		while(current.next != null){
		current = current.next;
		}
		current.next = temp;        
	    }
	return head;
}


public Node insertAtPosition(int data, int pos){
	Node temp = new Node(data);
        count = 1;
	if(pos == 1){
		temp.next = head;
		head = temp;
	}
	else{
		Node current = head;
		while(count < pos-1){
			current = current.next;
			count++;
		}
		temp.next = current.next;
		current.next = temp

	}
	return head;
}










