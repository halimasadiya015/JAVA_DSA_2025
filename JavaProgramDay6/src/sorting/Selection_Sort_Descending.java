package sorting;

public class Selection_Sort_Descending {
	public static void main(String[] args) {
		int[]array= {3,6,2,1,8,7,4,5,3,1};
		selectionSort(array);
		System.out.println("sorted array in descending order:");
		for(int i:array) {
			System.out.println(i +" ");
		}
	}
	public static void selectionSort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n -1;i++)
		{
			int maxIndex=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[maxIndex]) {
					maxIndex=j;
					
				}
			}
			int temp=arr[maxIndex];
			arr[maxIndex]=arr[i];
			arr[i]=temp;
		}
	}
}

