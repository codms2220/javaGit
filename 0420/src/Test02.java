/*
 * 식을 만족하는 A와B의 조합
 * 
 *  A B
 * +B A
 * _____
 *  9 9
 */
public class Test02 {
	
	public static void main(String[] args) {
		for(int a = 0; a <10; a++) {
			for(int b=0; b<10; b++) {
				if(a+b == 9) {
					System.out.println("a의 값은 = "+a + " b의 값은 = "+b);
				}
			}
		}
	}
}
