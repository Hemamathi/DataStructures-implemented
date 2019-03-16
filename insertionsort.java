package edu.neu.coe.info6205.bqs;

public class insertionsort {
	public void insertionsort1(int a[]) {
		for(int i=1;i<a.length;++i) {
			int key=a[i];
		int j=i-1;
				while(j>=0 &&key<a[j] ) {
					a[j+1] = a[j]; 
	                j = j-1; 
				}a[j+1]=key;
			}
			}
	public void heapsort(int arr[]) {
		int n=arr.length;
		for(int i=n/2-1;i>=0;i--) 
			heapify(arr,n,i);
		for(int i=n-1;i>=0;i--) {
			int temp = arr[0]; 
            arr[0] = arr[i]; 
            arr[i] = temp; 
              heapify(arr, i, 0); 
		}
	}
	public void heapify(int arr[],int n,int i) {
		int largest=i;
		int left=(2*i)+1;
		int right=(2*i)+2;
		if(left<n &&arr[left]>arr[largest]) 
			largest=left;
		
		if(right<n &&arr[right]>arr[largest]) 
			largest=right;
		
		if(largest!=i) {
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
	heapify(arr,n,largest);
		}
		
	}
	public void merge(int []a,int l,int middle,int r) {
		int n1=middle-l+1;
		int n2=r-middle;
		int a1[]=new int[n1];
		int a2[]=new int[n2];
		for(int i=0;i<n1;++i) 
			a1[i]=a[l+i];
		for(int j=0;j<n2;++j)
			a2[j]=a[middle+1+j];
		int i=0,j=0; int k=l;
		while(i<n1 && j<n2) {
			if(a1[i]<=a2[j]) {
				a[k]=a1[i];
				i++;
			} else {
				a[k]=a2[j];
				j++;
			}k++;
		}while(i<n1) {
			a[k]=a1[i];i++;k++;
		}while(j<n2) {
			a[k]=a2[j];j++;k++;
		}
	}
	public void mergesort(int a[],int l,int r) {
	
		if(l<r) {
			int middle=(l+r)/2;
		mergesort(a,l,middle);
		mergesort(a,middle+1,r);
		merge(a,l,middle,r);
		}
	}
	public void selectionsort(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				int min_index=i;
				if(a[min_index]>a[j]) {
					int temp=a[min_index];
					a[min_index]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	  static void printArray(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i=0; i<n; ++i) 
	            System.out.print(arr[i] + " ");
	    } 
public static void main(String[] args) {
	System.out.println("main executed");
	int []a= {12,11,13,5,6};
	insertionsort obj=new insertionsort();
	obj.mergesort(a, 0, 4);
	obj.printArray(a);
//obj.insertionsort1(a);
//obj.printArray(a);
//obj.selectionsort(a);
//obj.printArray(a);
//obj.heapsort(a);
//obj.printArray(a);
}}
