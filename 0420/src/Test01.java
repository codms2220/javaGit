/*
 * 구구단 짝수인 단인 2,4,6,8단만 출력하는 프로그램 작성.
 * 2단은 2*2까지
 * 4단은 4*4까지
 * 6단은 6*6까지
 * 8단은 8*8까지 출력하도록 작성
 */
public class Test01 {
	
	public static void main(String[] args) {
		
		for(int dan = 2; dan<9; dan=dan+2) {
			for(int num = 1; num <dan+1; num++) {
				System.out.println(dan + "*" + num + "=" + (dan*num));
			}
		}
	}

}
