class pn{
	public void primeNum(int input) {
		int count = 0;
		for(int i=1; i<input+1; i++) {
			if(input%i == 0) {
				count ++;
			}
		}
		if(count == 2) {
			System.out.println(input + "true");
		}else {
			System.out.println(input + "false");
		}
	}
}
public class Test04 {

	public static void main(String[] args) {
		pn a = new pn();
		
		for(int i=1; i<101; i++) {
			a.primeNum(i);
		}
	}
}
