/* 
 * 잔액 myBal
 * 계좌 확인 checkMyBal
 * 계좌 입금 depositMyBal
 * 계좌 출금 withdraw
 */
public class BankAccount {
	int myBal;
	
	/**
	 * 잔액 확인
	 */
	public void checkMyBal() {
		System.out.println("잔액 : "+myBal);
	}
	
	public void depositMyBal(int in) {
		myBal += in;
		System.out.println(in+"원 입금했습니다.");
	}
	public void withdraw(int out) {
		if(myBal<out) {
			System.out.println("출금 실패");
			return;
		}
		myBal -= out;
		System.out.println(out+"원 출금했습니다.");
	}
}