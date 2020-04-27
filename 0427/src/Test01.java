import java.util.Scanner;

public class Test01 {
	
	public static void doA(int num1, int num2) {
		System.out.println("두 수의 합은 "+(num1+num2));
		System.out.println("두 수의 차는 "+(num1-num2));
		System.out.println("두 수의 곱은 "+(num1*num2));
		System.out.println("두 수의 나눗셈의 몫은 "+(num1/num2));
		System.out.println("두 수의 나눗셈의 나머지는 "+(num1%num2));
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
