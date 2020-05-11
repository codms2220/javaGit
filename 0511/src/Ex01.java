class Accumulator{
	public static int result = 0;
	public static void add(int i) {
		result += i;
	}

	public static void showResult() {
		System.out.println("result = "+result);
	}
}

public class Ex01 {

	public static void main(String[] args) {
		for(int i = 0; i<10; i++) {
			Accumulator.add(i);
		}
		Accumulator.showResult();
	}
}
