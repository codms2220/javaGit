import java.util.Scanner;

public class Test02 {
	
	public static void doA(int num1, int num2) {
		int result = num1 - num2;
		if(result > 0) {
			System.out.println("차의 절대값 = "+result);
		}else {
			System.out.println("차의 절대값 = "+(-result));
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 정수를 입력하세요");
		int input1 = scan.nextInt();
		System.out.println("두번째 정수를 입력하세요");
		int input2 = scan.nextInt();
		
		doA(input1, input2);
	}
}
