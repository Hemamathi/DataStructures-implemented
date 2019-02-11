package edu.neu.coe.info6205.util;
public class tripletsum {
	public static void triplet(int[] a) {
		for(int i=0;i<a.length-2;i++) {
			for(int j=1;j<a.length-1;j++) {
				for(int k=2;k<a.length;k++) {
					if(a[i]+a[j]+a[k]==0) {
						System.out.println("array found:"+a[i]+a[j]+a[k]);
										}
					else {
						continue;
					}
					
				}
			}
		}
	}
	public static void main(String[] args) {
      int b[]= {-1,-2,3,-2,4};
      triplet(b);
	}
}