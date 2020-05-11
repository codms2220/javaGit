
public class Ex08 {

	Ex08(){
		int temp1[] = new int [10];
		int[] temp2 = new int [10];
		
		System.out.println("temp1.length = "+temp1.length);
		System.out.println("temp2.length = "+temp2.length);
		
		temp1[0] = 10;
		for(int i = 0; i < 10; i++) {
			System.out.println("temp1 ["+i+"]= "+temp1[i]);
		}
		
		String a [] = new String[10];
		a[0] = "aaa";
		a[9] = "abc";
		for(int i = 0; i < 10; i++) {
			System.out.println("a ["+i+"]= "+a[i]);
		}
	}
	public static void main(String[] args) {
		new Ex08();
	}
}
