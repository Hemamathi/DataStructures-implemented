package edu.neu.coe.info6205.bqs;
import java.util.*; 
import java.lang.*; 
import java.io.*;
import edu.neu.coe.info6205.bqs.Edge; 
public class graph {
int V,E;
Edge edge[];
graph(int v,int e){
	V=v;
	E=e;
	edge=new Edge[E];
	for(int i=0;i<e;++i) {
		edge[i]=new Edge();
	}
}
int find(int parent[],int i) {
	if(parent[i]==-1) 
		return i;
	return find(parent,parent[i]);
}
void union(int parent[],int x, int y) {
	int xset=find(parent,x);
	int yset=find(parent,y);
	parent[xset]=yset;
}
int isCycle(graph graph) {
	int parent[]=new int[graph.V];
	for(int i=0;i<graph.V;i++) {
		parent[i]=-1;
	}
	for(int i=0;i<graph.E;i++) {
int x=graph.find(parent, graph.edge[i].src);
int y=graph.find(parent, graph.edge[i].dest);
if(x==y) {
	return 1;
} graph.union(parent, x, y);
	}return 0;
}
public static void main(String[] args) {
	int V = 3, E = 3; 
	graph graph1=new graph(V,E);
	graph1.edge[0].src=0;
	graph1.edge[0].dest=1;
	graph1.edge[1].src=1;
	graph1.edge[1].dest=2;
	graph1.edge[2].src=2;
	graph1.edge[2].dest=3;

    if (graph1.isCycle(graph1)==1) 
        System.out.println( "graph contains cycle" ); 
    else
        System.out.println( "graph doesn't contain cycle" ); 
} 
}

