
public class Ex05 {

	Ex05(){
		doA();
		doA(1);
		doA(1,2);
	}
	private void doA() {
		System.out.println("doA함수 입니다.");
	}
	private void doA(int i) {
		System.out.println("i = "+i);
	}
	private void doA(int i, int j) {
		System.out.println("i = "+i+" j = "+j);
	}
	
	public static void main(String[] args) {
		new Ex05();
	}
}
