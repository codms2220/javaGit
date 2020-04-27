import java.util.Scanner;

class N{
	public static int n(int num) {
		if(num==0) {
			return 1;
		}else {
			return 2*n(num-1);
		}
	}
}
public class Test05 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("n을 입력하세요.");
		int input = scan.nextInt();
		
		N a = new N();
		System.out.println("2의 "+input+" 제곱은 "+a.n(input));
	}
}
