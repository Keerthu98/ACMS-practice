package lists;

import java.util.Scanner;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.insertLast(-1);
		l1.insertLast(9);
		l1.insertLast(10);
		l1.insertLast(1);
		l1.insertLast(-5);
		l1.insertLast(-7);
		l1.insertLast(25);
		System.out.println("Input:");
		l1.printList();
		l1.modify();
		System.out.println("Output:");
		l1.printList();
	}
	

}
