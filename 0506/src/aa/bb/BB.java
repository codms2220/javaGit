package aa.bb;
// ctrl + shift + o : 자동 import완성
import cc.dd.CC;

public class BB {
	public static void main(String[] args) {
		System.out.println("잘 되나");
		// cc.dd.CC c = new cc.dd.CC();
		CC c = new CC();
	}
}

/*
 * 다른 패키지 클래스 사용할때
 * 1. 풀캐지 적어주기
 * 2. import 적기
 */