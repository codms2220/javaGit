
public class RectMain {

	public static void main(String[] args) {
		Rect r1 = new Rect();
		
		// r1.width = 100; - private로 변수 선언해서 다른 클래스에서 접근할 수 없음
		
		r1.setWidth(100);
		System.out.println(r1.getWidth());
	}
}
