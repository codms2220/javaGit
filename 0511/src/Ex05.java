class AA{
	String a = "abcd";
	
	public String returnA() {
		return a;
	}
}
public class Ex05 {

	public static void main(String[] args) {
		AA aa = new AA();
		String a = aa.returnA();
		a= a.concat("cc");
		
//		String a = new AA().returnA().concat("cc"); 위에 3문장 합친거
		System.out.println("a = "+a);
	}
}
