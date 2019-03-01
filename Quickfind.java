package edu.neu.coe.info6205.bqs;
import java.util.Scanner;
public class Quickfind {
private int[] id;
public Quickfind(int N) {
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
	int pid=id[p];
	int qid=id[q];
	for(int i=0;i<id.length;i++) {
		if(id[p]==id[q]) {
			id[i]=qid;
		}
	}
}
public boolean connected(int p,int q) {
	return find(p)==find(q);
}
public static void main(String[] args) {
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
