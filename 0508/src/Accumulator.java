
public class Accumulator {

	static int sum;
	
	static void add(int num){
		sum += num;
	}
	static void showResult(){
		System.out.println("sum = "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 0; i < 10; i++)
			Accumulator.add(i);
		Accumulator.showResult();
	}

}
