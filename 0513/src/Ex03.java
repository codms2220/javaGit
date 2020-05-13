class A{
	A(){
		System.out.println("A클래스 생성자");
	}
}
class B extends A{
	B(){
//		상위 클래스 호출, 생략되어져있음
		super();
		System.out.println("B클래스 생성자");
	}
}

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new B();
	}

}
