import java.util.Scanner;

class Human{
	int hp = 100;
	// 사람이 몬서트 공격
	void doAtt( Monster mon) {
		mon.hp = mon.hp -3;
		System.out.println("몬스터 hp ="+mon.hp);
	}
}
class Monster{
	int hp = 100;
	// 몬스터가 사람 공격
	void doAtt(Human human) {
		human.hp = human.hp -4;
		System.out.println("사람 hp ="+human.hp);
	}
}
public class Game {
	public static void main(String[] args) {
		Human h1 = new Human();
		Human h2 = new Human();
		Monster m1 = new Monster();
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("무슨 행동을 하시겠습니까 \n1. 사람이 몬스터 공격");
			System.out.println("2. 몬스터가 사람 공격\n3.종료");
			
			int select = scan.nextInt();
			if(select == 1) {
				h1.doAtt(m1);
			}else if(select == 2) {
				m1.doAtt(h1);
			}else {
				System.out.println("종료");
				System.exit(1);
			}
		}
	}
}
