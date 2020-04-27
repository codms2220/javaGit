/*
 * 2단 4단 6단 8단
 * 2	4	6	8
 */
public class Ex01 {

	public static void main(String[] args) {
		// (i++) == (i=i+1)
		for(int i=2; i<9; i=i+2) {
			for(int j=1; j<i+1; j++) {
				System.out.println(i + "*"+j+"="+i*j);
			}
			System.out.println();
		}
	}
}
