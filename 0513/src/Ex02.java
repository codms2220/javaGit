import java.util.Scanner;

public class Ex02 {
	private Student[] stus = new Student[10];
	int cnt = 0;
	Scanner scan = new Scanner(System.in);

	Ex02(){
		while(true) {
			System.out.println(" 1. 학생입력\n 2. 학생출력\n 3. 종료");
			int select = scan.nextInt();
			if(select == 1) {
				scan.nextLine();
				// 학생 입력
				System.out.println("학생 이름 입력 : ");
				String name = scan.nextLine();
				System.out.println("학생 나이 입력 : ");
				int age = scan.nextInt();
				stus[cnt] = new Student(name, age, (cnt+1));
				
				System.out.println("1명의 학생을 등록했습니다.");
				cnt++;
			}
			else if(select == 2) {
				// 학생 출력
				for(int i = 0; i<stus.length; i++) {
					System.out.println("stus["+i+"] = "+stus[i]);
				}
			}
			else {
				// 종료
				break;
			}
		}
//		stus[0] = new Student("홍길동",20,1);
//		stus[1] = new Student("김길동",30,2);
//		stus[2] = new Student("이길동",40,3);
//		stus[3] = new Student("박길동",40,4);
		
		// 배열의 내용 출력하는 구문
//		for(int i = 0; i<stus.length; i++) {
//			System.out.println("stus["+i+"] = "+stus[i]);
////			System.out.println("stus["+i+"] = "+stus[i].toString());
////			toString 메소드 생략가능 11줄 코드와 같은 결과 출력
//		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex02();
	}
}
