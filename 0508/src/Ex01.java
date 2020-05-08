/*
 * 데이터영역 - static 변수 (프로그램 시작에서 종료까지 존재)
 * 스택영역 - 함수 시작시에 지역변수 선언하고 함수 종료시 자동으로 날아가는 변수
 * 힙영역 
 * - c언어 : malloc 함수와 free 함수로 직접 메모리 할당 해제
 * - new 객체를 통해 선언하면 메모리상에 올라가고 jvm이 자동으로 메모리상에서 날림
 */

class StaticVariable{
	static int a = 0;
	public int b = 0;
	
	StaticVariable(){
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println();
		a++;
		b++;
	}
}

public class Ex01 {
	Ex01(){
		StaticVariable sv1 = new StaticVariable();
		StaticVariable sv2 = new StaticVariable();
		StaticVariable sv3 = new StaticVariable();
		System.out.println("sv1.a = "+sv1.a);
		System.out.println("sv2.a = "+sv2.a);
		System.out.println("sv3.a = "+sv3.a);
		System.out.println("StaticVariable.a = "+StaticVariable.a);
	}
	public static void main(String[] args) {
		new Ex01();
	}
}
