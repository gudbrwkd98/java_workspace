/* use 패키지에서 Account 계좌 클래스를 접근해보겠습니다*/

/* 사용을 하려는 쪽은 공개가 될필요가 없음.. 사용당하는 쪽만 공개하면 됩니다
	결론은 이 클래스는 공개할 필요가 없음
	UseAccount(사용하려는 객체) ---> Account(사용당할 객체) 공개되어야함
*/
package use;
//사용하려는 클래스의 위치 알려줍니다.
import bank.Account; //bank 이전의 경로는 이미 class path 에 등록되어있음
class UseAccount{
	public static void main(String[] args) {
		Account acc = new Account(); //계좌 클래스 생성 (public 이라 여기까지는 무조건 가능함
		//이제 접근제한자 별로 접근해보겠습니다.

		//bank 은행명은 public 으로 선언되어있으므로 무조건 접근이 가능합니다
		System.out.println(acc.bank);
		//customer 는 protected 선언되어 있으므로 상속 관계에 있거나 같은 패키지
		//인경우 에만 접근이 가능합니다.. 현재 UseAccount 는 Account와 상속관계가 없고
		//서로 다른 패키지이므로 데이터 접근이 불가능할겁니다 
		//System.out.println(acc.customer);
		//계좌 num 변수는 개발자가 아무것도 명시하지않았는데요 이러한 접근제한자는 defult
		//제한자라 한다 같은 패키지에 있는 클래스끼리만 접근을 허용 
		//System.out.println(acc.num);
		//한단계 더 까다롭다 (즉 상속관계가 있어도 같은패키지가 아니라면 접근 불가);
		
		//계좌 잔액 balance를 테스트 해 봅시다
		//balance는 가장 강력한 접근제한자인 private 이 적용되어있으므로, Account 클래스 스스로만
		//접근이 가능합니다.. 따라서 우리는 Account 자신이 아니라서, 절대절대 사용못합니다
		//완전 폐쇠적이죠...
		//System.out.println(acc.balance);
		acc.setBalance(10);
		System.out.println(acc.getBalance());
	}
}
