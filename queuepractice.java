package edu.neu.coe.info6205.bqs;

public class queuepractice {
int front,rear,size;
int capacity;int [] array;
public queuepractice(int capacity) {
	this.capacity=capacity;
	front=this.size=0;
	rear=capacity-1;
	array=new int[this.capacity];
}
boolean isFull(queuepractice q) {
	return(q.capacity==q.size);
}
boolean isempty(queuepractice b) {
	return(b.size==0);
}
public void enqueue(int x) {
	if(isFull(this)) return;
this.rear=(this.rear+1)%this.capacity;
this.array[rear+1]=x;
this.size=this.size+1;
System.out.println("added"+x);
}
public void dequeue(int x) {
	if(isempty(this)) return;
	this.front=(this.front+1)%this.capacity;
	this.size=this.size-1;
	System.out.println("deleted");
}
int front() {
	return(this.array[this.front]);
}
int rear() {
	return(this.array[this.rear]);
}
public static void main(String[] args) {
	queuepractice qp=new queuepractice(100);
	qp.enqueue(20);
	qp.enqueue(10);
	qp.enqueue(40);
	qp.dequeue(10);
	System.out.println(qp.front());
	System.out.println(qp.rear());
}
}
