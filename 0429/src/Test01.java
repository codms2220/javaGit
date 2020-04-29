import java.util.Scanner;
/*
 * 밑변과 높이 정보를 저장할 수 있는 triangle 클래스 정의
 * 밑변과 높이 정보를 변경할 수 있는 메소드와 삼각형의 넓이를 계산해서 반환하는 메소드 정의
 */
class Triangle{
	int bottom;
	int height;
	
	public  Triangle(int a, int h) {
		bottom = a;
		height = h;
	}
	public void doInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("(변경)밑변 입력 : ");
		bottom = scan.nextInt();
		System.out.println("(변경)높이 입력 : ");
		height = scan.nextInt();
	}
	public void doArea() {
		double area = (bottom*height)/2.0;
		System.out.println("넓이는 = "+area);
	}
}

public class Test01 {
	public static void main(String[] args) {
		
		System.out.println("밑변을 입력하세요");
		Scanner scan = new Scanner(System.in);
		int input1 = scan.nextInt();
		System.out.println("높이을 입력하세요");
		int input2 = scan.nextInt();
		
		Triangle triangle = new Triangle(input1,input2);
		triangle.doArea();
		
		triangle.doInfo();
		triangle.doArea();
	}
}
