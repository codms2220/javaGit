
public class Ex04 {

	public static void main(String[] args) {
		
		String a = "abcd";
		String b = "abcd";
		
		String c = new String("abcd");
		String d = new String("abcd");

		if(a==b)
			System.out.println("a==b 같은 메모리 주소를 참조하고 있다.");
		else
			System.out.println("a==b 다른 메모리 주소를 참조하고 있다.");
		if(c==d)
			System.out.println("c==d 같은 메모리 주소를 참조하고 있다.");
		else
			System.out.println("c==d 다른 메모리 주소를 참조하고 있다.");

		if(c.equals(d))
			System.out.println("c와 d 내용이 같다.");
		
//		자료형 값을 문자열로 바꾸기
		double doublea = 10.23;
//		String stringa = doublea+"";
		String stringa = String.valueOf(doublea);
	}
}
