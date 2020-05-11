class MinMax{
	
	public static int minValue(int[] arr) {
		int min = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(min > arr[i])
				min = arr[i];
		}
		return min;
	}
	public static int maxValue(int[] arr) {
		int max = arr[0];
		for(int e : arr) {
			if(max < e)
				max = e;
		}
		return max;
	}
	
}
public class Test03 {

	public static void main(String[] args) {
		
		int arr[] = {6,2,4,5,10,7,8,3};
		MinMax a = new MinMax();
		System.out.println("최솟값은 = "+a.minValue(arr));
		System.out.println("최댓값은 = "+a.maxValue(arr));
	}

}
