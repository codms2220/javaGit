import java.util.Scanner;

class doA{
	void area(int r) {
		double area = r * r * 3.14;
		System.out.println("원의 넓이는 "+area);
	}
	void length(int r) {
		double length = 2*r*3.14;
		System.out.println("원이 둘레는 "+length);
	}
}

public class Test03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("원의 반지름을 입력하세요.");
		int rad=scan.nextInt();
		
		doA a = new doA();
		a.area(rad);
		a.length(rad);
	}
	
}
