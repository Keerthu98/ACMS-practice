package lists;

import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Input:");
		LinkedList<Integer> l1=new LinkedList<Integer>();
		LinkedList<Integer> l2=new LinkedList<Integer>();
		l1.insertLast(1);
		l1.insertLast(2);
		l1.insertLast(3);
		l2.insertLast(5);
		l2.insertLast(7);
		l1.printList();
		l2.printList();
		System.out.println("Output:");
		LinkedList<Integer>sum=add(l1,l2);
		sum.printList();
		System.out.println("Input:");
		l1=new LinkedList<Integer>();
		l2=new LinkedList<Integer>();
		l1.insertLast(1);
		l1.insertLast(0);
		l1.insertLast(0);
		l2.insertLast(-1);
		l2.insertLast(0);
		l1.printList();
		l2.printList();
		System.out.println("Output:");
		sum=add(l1,l2);
		sum.printList();
	}
	
	//method to add two lists
	public static LinkedList<Integer> add(LinkedList<Integer> a,LinkedList<Integer> b){
		int x=0,y=0,sum;
		Node<Integer> n=a.Head();
		
		//converting list a to int
		while(n!=null) {
			x=x*10+n.Data();
			n=n.next;
		}
		
		//converting list b to int
		n=b.Head();
		while(n!=null) {
			y=y*10+n.Data();
			n=n.next;
		}
		//sum of two numbers
		sum=x+y;
	
		//creating sum list 
		LinkedList<Integer> s=new LinkedList<Integer>();
		while(sum!=0) {
			s.insertFirst(sum%10);
			sum=sum/10;
		}
		return s;
	}

}
