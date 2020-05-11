
public class Accumulator {

	 int sum;
	
	 void add(int num){
		sum += num;
	}
	 void showResult(){
		System.out.println("sum = "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accumulator ac = new Accumulator();
		for(int i = 0; i < 10; i++)
			ac.add(i);
		ac.showResult();
	}

}
