import java.util.Scanner;

class Circle{
	public void doArea(int r) {
		System.out.println("원의 넓이는 = "+(r*r*3.14));
	}
	public void doLength(int r) {
		System.out.println("원의 둘레는 = "+(2*r*3.14));
	}
}
public class Ex03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Circle circle = new Circle();
		
		System.out.println("원 반지름 입력");
		int num1 = scan.nextInt();
		
		circle.doArea(num1);
		circle.doLength(num1);
		
	}
}
