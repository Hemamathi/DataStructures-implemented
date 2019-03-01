package edu.neu.coe.info6205.bqs;

public class tripletsum {
public boolean threesummethod(int a[], int sum) {
	for(int i=0;i<a.length-2;i++) {
		for(int j=i+1;j<a.length-1;j++) {
			for(int k=1+2;k<a.length;k++) {
				if(a[i]+a[j]+a[k]==sum) {
					System.out.println(a[i]);
					System.out.println(a[j]);
					System.out.println(a[k]);
					System.out.println(sum);
					return true;
				}
			}
		}
	}
	return false;
}
	public static void main(String[] args) {
		System.out.println("main executed");
		tripletsum o1=new tripletsum();
		int x[]= {1,2,3,-4,5,6,7,-3};
		o1.threesummethod(x, 1);
	}
}
