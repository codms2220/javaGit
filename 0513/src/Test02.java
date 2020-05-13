
public class Test02 {

	public static void doA(int ary[][],int r, int c) {
		int brr[][] = new int[r][c];
		
		for(int i=0; i<ary.length; i++) {
			for(int j=0; j<ary[i].length; j++) {
				brr[i][j] = ary[ary.length-i-1][j];
				System.out.print(brr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int row = arr.length;
		int col = arr[0].length;
		
		doA(arr,row,col);
		
		int brr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		row = brr.length;
		col = brr[0].length;
		
		doA(brr,row,col);
	}
}
