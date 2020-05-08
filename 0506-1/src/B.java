
public class B {
	B(){
		System.out.println("B 기본생성자");
		doA();
	}
	// private 선언할경우 다른 클래스에서 접근 못함
	private void doA() {System.out.println("B.doA()메서드");}
}
