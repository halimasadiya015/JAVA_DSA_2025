package sorting;

public class Selectionsort {
	public static void main(String[] args) {
		int[]array= {64,25,12,22,11};
		selectionSort(array);
		System.out.println("sorted array :");
		for(int i:array) {
			System.out.println(i +" ");
		}
	}
	public static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++)
		{
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
					
				}
			}
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
			

					
			
		}
		
	}
}
