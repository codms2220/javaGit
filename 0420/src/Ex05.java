import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		System.out.println("스위치 공부해야됨");
		
		System.out.println("숫자를 입력하세요.");

		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();

		// 자동 정렬 ctrl + shift + f
		switch (input) {
		case 1:
			System.out.println("1 입력");
			break;
		case 2:
			System.out.println("2 입력");
			break;
		case 3:
			System.out.println("3 입력");
			break;
		default:
			System.out.println("다른거 입력");
			break;
		}
	}
}
