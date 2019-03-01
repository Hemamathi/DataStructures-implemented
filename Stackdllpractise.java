package edu.neu.coe.info6205.bqs;

public class Stackdllpractise {
Node head;
Node tail;
int data;
Node link;
int count;
public void push(int x) {
	Node temp=new Node();
	temp.data=x;
	temp.next=head;
	temp.prev=null;
	head=temp;
	count++;
	System.out.println("pushed"+x);
}
public void pop() {
head.next=head;
count--;
System.out.println("popped"+head.data);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stackdllpractise sdll=new Stackdllpractise();
sdll.push(10);
sdll.push(20);
sdll.push(30);
sdll.pop();
}

}
