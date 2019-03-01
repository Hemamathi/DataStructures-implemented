package edu.neu.coe.info6205.bqs;

public class binarysearchdemo {
	public int bssearch(int l,int r,int x,int[]a) {
		if(r >=l) {
			int mid=l+(r-l)/2;
			if(a[mid]==x) {
				return mid;
			} if(a[mid]>=x){
				return bssearch(l,mid-1,x,a);
			} else if(a[mid]<=x) {
				return bssearch(mid+1,r,x,a);
			}
		}
		return -1;
	}
	public static void main(String[] args) {
	binarysearchdemo bs=new binarysearchdemo();
	int arr[]= {10,20,30,40,60,60};
	int result=bs.bssearch(0, 5, 60, arr);
	System.out.println(result);
}
}
