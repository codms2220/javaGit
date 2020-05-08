
public class Ex07 {
	
	int a = 10;
	int b = 20;
	
	Ex07(){
		System.out.println("기본 생성자");
	}
	Ex07(int aa){
//		기본생성자 호출
		this();
		System.out.println("파라메터 한개 있는 생성자");
		a = aa;
	}
	Ex07(int cc, int bb){
//		파라미터가 한개 있는 생성자 호출
		this(cc);
		System.out.println("파라메터 두개 있는 생성자");
		b = bb;
	}
	public void doPrint() {
		System.out.println("a = "+a+" b = "+b+"\n");
	}
	
	public static void main(String[] args) {
		Ex07 ex1 = new Ex07();
		Ex07 ex2 = new Ex07(11);
		Ex07 ex3 = new Ex07(12,22);
		ex1.doPrint();
		ex2.doPrint();
		ex3.doPrint();
	}
}
