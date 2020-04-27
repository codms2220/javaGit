import java.util.Scanner;

public class Test06 {
	static String bin = "";
	public static int decTobin(int dec) {
		
		if(dec==1) {
			bin += dec % 2;
			return 1;
		}
		else {
			 // dec = dec/2;
			bin += dec % 2;
			return decTobin(dec/2);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("10진수 정수를 입력하세요");
		int input = scan.nextInt();

		decTobin(input);
		
		for(int i=bin.length()-1; i>=0; i--) {
			System.out.print(bin.charAt(i));
		}
	}
}
