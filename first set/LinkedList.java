package lists;

public class LinkedList<E>{

	
	
	private Node<E> head = null;
	private Node<E> tail = null;
	private int sz = 0;
	public LinkedList() {		
	}
	public int size() { 
		return sz;
    }
	public boolean isEmpty() { 
		return (sz==0);
	}
	
	public E first() {
		// returns (but does not remove) the first element
		if(isEmpty())
			return null;
		else return head.Data();
	}
	public Node<E> Head() {
		// returns (but does not remove) the first element
		if(isEmpty())
			return null;
		else return head;
	}
	public void insertLast(E e) {
		// adds element e to the end of the list
		Node<E> newest=new Node<>(e,null);
		if(isEmpty()) {
			head=newest;
			tail=newest;
		}
			
		else {
			tail.setNext(newest);
			tail=newest;
		}
		sz++;
	}
	public void insertFirst(E e) {	// adds element e to the front of the list
		// create and link a new node
	head=new Node<>(e,head);
	if(isEmpty())
		tail=head;
	sz++;
}
	public void printList(){
		if(isEmpty())
			System.out.println("List is empty");
		else
		{
			Node<E> k;
			for(k=head;k!=null;k=k.SetNext())
			{
				System.out.print(k.Data()+":>");
			}
			System.out.println();
		}
		}
	public Node<E> getlast() {
		// returns (but does not remove) the last element
		if(isEmpty())
			return null;
		else
			return tail;
	}
	
	//method to modify list as per first problem
	public void modify() {
		Node<E> n1 = head , p=head;
		Node<E> t=tail;
		//loop traverse the list
		while(true)
		{
			//condition to check for negative numbers
			if((int)n1.Data()<0) {
				p=n1;			//pointer to last seen negative number
				n1=n1.next;
			}
			else {						//for positive number
				if(n1==head)			//if first node is negative move head to next node
					head=n1.next;
				p.next=n1.next;			//statements to move positive no. to the tail of the list
				n1.next=null;
				tail.next=n1;
				tail=tail.next;
				n1=p.next;
				if(tail==t)				//condition to break out of list 
					break;
			}
			
		}

	}
}
