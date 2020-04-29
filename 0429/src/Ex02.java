import java.util.Scanner;

class ABS{
	public void doABS(int a, int b) {
		if(a>b)
			System.out.println("차의 절대값 = "+(a-b));
		else
			System.out.println("차의 절대값 = "+(b-a));
	}
}
public class Ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 수 입력");
		int num1 = scan.nextInt();
		System.out.println("두번째 수 입력");
		int num2 = scan.nextInt();
		
		ABS abs = new ABS();
		abs.doABS(num1, num2);
	}
}
