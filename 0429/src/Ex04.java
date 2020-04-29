class PrimeNumber{
	public boolean doPrime(int a) {
		int cnt = 0;
		for(int i=1; i<=a; i++) {
			if(a%1 == 0)
				cnt++;
		}
		if(cnt == 2)
			return true;
		else
			return false;
	}
}
public class Ex04 {

	public static void main(String[] args) {
		
		PrimeNumber pn = new PrimeNumber();
		for(int i=1; i<101; i++) {
			if(pn.doPrime(i));
			System.out.println(i);
		}
	}
}
