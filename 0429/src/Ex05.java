import java.util.Scanner;
// static 시작과 동시에 메모리 할당
class Jae{
	public static int jae(int n) {
		if(n>0)
			return jae(n-1)*2;
		else
			return 1;
	}
}
public class Ex05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Jae jae = new Jae();
		
		System.out.println("몇 승?");
		int num = scan.nextInt();
		// int result = jae.jae(num);
		
		int result = Jae.jae(num);
		System.out.println("2의 "+num+"승은 "+result+"입니다.");
	}
}
