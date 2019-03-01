package edu.neu.coe.info6205.bqs;

import java.util.Scanner;

public class quickunion {
private int[] id;
public quickunion(int N) {
	id=new int[N];
	for(int i=0;i<N;i++) {
		id[i]=i;
	}
}
public int find(int i) {
	while(i!=id[i])i=id[i];
	return i;
}
public void union(int p,int q) {
	int i=find(p);
	int j=find(q);
	id[i]=j;
}
public boolean connected(int p,int q) {
	return find(p)==find(q);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		Quickfind qf=new Quickfind(obj.nextInt());
		int p=obj.nextInt();
		int q=obj.nextInt();
		if(!qf.connected(p,q)) {
		qf.union(p, q);
		System.out.println(p+"->"+q);
		}
		}
	}

