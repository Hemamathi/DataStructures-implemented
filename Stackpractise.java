package edu.neu.coe.info6205.bqs;
import java.io.*; 
import java.io.*; 
import java.util.*;
public class Stackpractise {
static final int max=100;
int top;
int[]a=new int[max];
boolean isempty() {
	return(top<0);
}
Stackpractise(){
	top=-1;
}
boolean push(int x) {
	a[++top]=x;
	System.out.println("pushed"+x);
	return true;
}
int pop() {
	int x=a[top--];
	System.out.println("popped"+x);
	return x;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stackpractise sp=new Stackpractise();
sp.push(10);
sp.push(20);
sp.pop();
	}

}
