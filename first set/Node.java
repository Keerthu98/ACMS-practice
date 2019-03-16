package lists;

public class Node<E> {

	private E data; //data at a node of list
	Node<E> next;   //pointer to next node
	
	//null node
	public Node(){
		
	}
	
	//Node constructor
	public Node(E e, Node<E> n) {
	data=e;
	next=n;
	}
	
	public E Data( ) { return data; }
	
	public Node<E> SetNext( ) { return next; }
	
	public void setNext(Node<E> n) { next = n; }

}
