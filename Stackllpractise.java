package edu.neu.coe.info6205.bqs;

public class Stackllpractise {
int data;

Node top;
Stackllpractise() {
	this.top=null;
}
public void push(int x) {
	Node temp=new Node();
	if(temp==null) {
		System.out.println("Node is empty");
	}else {
		temp.data=x;
		temp.link=top;
		top=temp;
	System.out.println("pushed"+x);
	}
}
public void pop() {
	top=(top).link;
	System.out.println("popped"+top.data);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stackllpractise node=new Stackllpractise();
node.push(10);
node.push(20);
node.pop();
	}

}
