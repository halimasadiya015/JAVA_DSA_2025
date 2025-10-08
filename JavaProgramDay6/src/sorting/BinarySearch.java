package sorting;

public class BinarySearch {
	public static void main(String[] args) {
		{
			int[]arr= {1,3,5,7,9,15,31};
			int key=15;
			
			int index=binarySearch(arr,key);
			
			if (index == -1) {
				
			System.out.println("element not found ");
			}
			else {
				System.out.println("element found at :" + index);
			
		}
		public static int binarySearch(int[] arr,int key) {
		int start =0, end=arr.length;
		
		while(start<end)
		{
			int mid = (start + end)/2;
			
			if (arr[mid]== key)
			{
				return mid;
			}
			else if (key>arr[mid])
			{
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
		}
		return -1;
		
	}

}
