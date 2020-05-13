
public class Test01 {

	public static void addOneDArr(int[] arr, int add) {
		for(int i=0; i<arr.length; i++) {
			arr[i] += add;
		}
	}
	
	public static void addTwoDArr(int[][] arr, int add) {
		for(int i=0; i<arr.length; i++) {
			addOneDArr(arr[i],add);
//			for(int j=0; j<arr[i].length; j++) {
//				arr[i][j] += add;
//				System.out.print(arr[i][j]+"\t");
//			}
//			System.out.println();
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] brr = {{1,2,3},{4,5,6},{7,8,9}};
		int a = 3;
		
		addTwoDArr(brr,a);
	}
}
