
public class Ex08 {
	private int a = 10;
	
	public Ex08(int a) {
//		this없이 a = a;로 선언하면 10출력
		this.a = a;
	}
	public void showA() {
		System.out.println("a = "+a);
	}
	
	public static void main(String[] args) {
		Ex08 ex08 = new Ex08(20);
		ex08.showA();
	}
}
