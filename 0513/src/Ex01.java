
public class Ex01 {
	Ex01(){
		int arry[] = {1,34,20,2,10,34,290,30};
		
		int min = arry[0];
		int max = arry[0];
		for(int i : arry) {
			if(i<min) {
				min = i;;
			}
			if(i>max) {
				max = i;
			}
		}
		System.out.println("최댓값 = "+max);
		System.out.println("최솟값 = "+min);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex01();
	}

}
