package edu.neu.coe.info6205.bqs;
import java.util.Arrays;
public class bagImplementation {
private static final int maxSize=10;
private int count;
private int[] bag= {1,2,3,4};

public void add(int a) {
	if(bag.length!=0) {
		this.count++;
		for(int i=0;i<=bag.length+1;i++) {
			bag[bag.length]=a;
		System.out.println(bag[i]);
		}
	}
}
public bagImplementation clone() {
	bagImplementation clone=new bagImplementation();
	for(int i=0;i<bag.length;i++)
{
		clone.add(this.bag[i]);
}return clone;
}
public boolean remove(int a)
{
	for(int i=0;i<bag.length;i++) {
		this.bag[i]=0;
		this.count--;
//			System.out.println(bag[i]);
		
		return true;
	}return false;
}
public static void main(String[] args) {
	bagImplementation bi=new bagImplementation();
	bi.add(10);
	bi.remove(4);
	bi.clone();
	}
}
