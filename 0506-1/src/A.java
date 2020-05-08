
public class A {

	public static void main(String[] args) {
		B b = new B();
		// B기본생성자
		// private로 선언해서 오류
		b.doA();
		// B.doA() 메서드
	}
}
