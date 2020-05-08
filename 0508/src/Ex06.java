
public class Ex06 {
	
	int a = 10;
	int b = 20;
	
	Ex06(){
		
	}
	Ex06(int aa){
		a = aa;
	}
	Ex06(int aa, int bb){
		a = aa;
		b = bb;
	}
	public void doPrint() {
		System.out.println("a = "+a);
		System.out.println("b = "+b+"\n");
	}
	
	public static void main(String[] args) {
		Ex06 ex1 = new Ex06();
		Ex06 ex2 = new Ex06(11);
		Ex06 ex3 = new Ex06(12,22);
		ex1.doPrint();
		ex2.doPrint();
		ex3.doPrint();
		
	}
}
