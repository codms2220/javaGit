
public class Test02 {

	public static void main(String[] args) {
		StringBuilder pnum = new StringBuilder("990925-1012999");
		
		pnum.replace(6,7," ");
		System.out.println(pnum);
	}
}
