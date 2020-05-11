
public class Ex03 {
	Ex03(){
		String a = "MyStringa";
		String b = "MyStringb";
		
		System.out.println("a.charAt(0) = "+a.charAt(0));
		System.out.println("a.charAt(1) = "+a.charAt(1));
		
//		== 주소값 비교
		System.out.println(a == "MyStringa");
//		문자열 비교는 equals 사용
		System.out.println(a.equals("MyStringa"));
		
		String split_="a,b,c,d,e";
//		,를 기준으로 나눠서 배열에 넣어줌
		String[] split = split_.split(",");
		for(String temp : split) {
			System.out.println("temp = "+temp);
		}
		System.out.println();
		
		int [] test = {1,2,3,4,5};
		for(int i : test) {
			System.out.println("i = "+i);
		}
		
		System.out.println(a);
		System.out.println(a.length());
		System.out.println();
		
		System.out.println(b);
		System.out.println(b.length());
		System.out.println();
		
		showString("Mystringc");
	}
	
	public void showString(String c) {
		System.out.println(c);
		System.out.println(c.length());
		System.out.println();
	}
	public static void main(String[] args) {
		new Ex03();
	}
}
