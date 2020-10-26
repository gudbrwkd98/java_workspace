package bank;//원본소스용 bank 패키지는 여러분이 직접 만들어야합니다

/*고객의 계좌를 정의한다: 업무가 신중해짐...예민한 데이터를 많이 다룸*/
//패키지에 넣은 클래스를 public 으로 공개하지않으면 다른 어떠한 클래스도 이 
//클래스를 사용할수 없습니다 이건 보안이 아니라 그냥 의미없는 짓입니다.
//클래스는 쓰라고 만드는 것이기에 떄문에 public 으로 공개하되, 그안의 내용들에 대헤
//보안처리 하면되는거에요~
//따라서 public 으로 공개해주세요 ~! 
public class Account{
	/*계좌에 들어갈만한 속성들 정의하고 점심 시간 갖겠습니다 */

	public String bank = "기업은행";//은행이름 
	protected String customer; //고객이름
	String num = "022-388-87232"; //계좌번호
	private int balance = 100000;//금액
	//아래의 메서드는 public 이므로 모든 객체가 접근할수있어요
	//UseAccount 잔고를 수정하고 출력도 해봅시다
	public void setBalance(int balance){
		this.balance = balance;
	}

	public int getBalance(){
		return balance;
	}

	 
}
