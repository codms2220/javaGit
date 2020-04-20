import java.util.Scanner;

/*
 * javac명령어로 컴파일하기.
 * 이클립스 사용하기때문에 자동 컴파일 됨.
 * 
 * debug 이클립스에서 사용하는 개발자 개발도구
 * f6 라인 진행
 * f8 디버그 모드 종료 or 다음 브레이크 포인트 진행
 */

public class Ex01 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		/* 
		 * char a[30];
		 * fgets(a,stdin);
		 */
		System.out.println("단어를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		String inputValue = scan.nextLine();
		System.out.println("inputValue = "+inputValue);
	}
}
