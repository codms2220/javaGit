
public class Ex04 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		String c = "";
		
		c = (a > b) ? "a가 큽니다.":"b가 큽니다.";
		System.out.println("c = "+ c);
		System.out.println("c = "+ ( a>b ? "a가 큽니다.":"b가 큽니다."));
		
		int d = (a > b) ? 0:1;
		System.out.println("d = "+ d);
	}
}
