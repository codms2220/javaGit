class StaticMethod{
	// static int a = 0; - static변수 선언을 하지않고 static 영역에서 변수 호출하면 오류
	
	public static void doA() {
		int a = 10;
		System.out.println("스테틱 매서드 입니다.");
		System.out.println("a = "+a);
	}
}

public class Ex03 {
	public static void main(String[] args) {
		StaticMethod sm = new StaticMethod();
		sm.doA();
		StaticMethod.doA();
	}
}
