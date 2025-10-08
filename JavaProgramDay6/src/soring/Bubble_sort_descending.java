package soring;

public class Bubble_sort_descending {
	public static void main(String[] args) {
		int[]array= {3,6,2,1,8,7,4,5,3,1};
		bubbleSort(array);
		System.out.println("sorted array in descending order:");
		for(int i:array) {
			System.out.println(i +" ");
		}
	}
	public static void bubbleSort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n -1;i++)
		{
			for(int j=i+1;j<n-i-1;j++) {
				if(arr[j]<arr[j+1]) {
		}
			}
			int j;
			int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
	}
	}
}

