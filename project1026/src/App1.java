package gui;
import java.awt.Frame; //사용하려는 클래스의 위치 등록
					   // 어디낙에 .class 로 존재하기 : 떄문에 사용가능할 것이다...
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Checkbox;
import java.awt.TextArea;
import java.awt.Label;
import java.awt.Image;
import java.awt.Toolkit;
class App1{
	public static void main(String[] args) {
		/*윈도우 생성*/

		/*난생처음 보는 클래스를 만났을때 대처법
			대응,대처 자세1) 사용하려는 클래스가 대충 어떤 목적으로 지원되는것인지 그 용도파악
			대응,대처 자세2) 자바의 모든 객체는 결국 3가지 유형밖에 없다
			대응,대처 자세3) 클래스는 쓰라고 만든것이다, 따라서 메모리에 올리는법을 알면된다.
			1)일반클래스 : new 하면 된다!! new 뒤의 생성자 조사(api문서)
			2)추상클래스 : new 불가하므로 자식을 정의해서 new 하거나 이미 구현한 인스턴스를 이용하면 된다(api 문서 통해)
			3)인터페이스 : new 불가하므로 자식을 정의해서 new 하거나 이미 구현한 인스턴스를 이용하면 된다 (api 문서통해)

		*/

		Frame frame = new Frame();
		//frame 은 디폴트가 눈에 보이지 않는 상태이다. 따라서 보이도록 메서드 호출.
		//
		frame.setVisible(true);
		frame.setBounds(500,400,300,400); // left,top,width,height
		
		FlowLayout flow = new FlowLayout();
		
		//크기를 지정하기전에 레이아웃 스타일을 지정해야한다
		//일단 flowlayout을 사용
		frame.setLayout(flow);
	
	
		Label la = new Label("회원가입 양식입니다");
		frame.add(la);
	
	
		TextField tf1 = new TextField("",20);
		frame.add(tf1);	//textbox 를 윈도우 컨테이너에 부착하기

		//윈도우 생성 완료 ,안에배치할 각종 컴포넌트 배치
		//1.버튼 생성 일반 추상 인터중에 클래스 구분... 일반이기에 new 
		//java.awt.Button bt 가능... 하지만 식별성이 떨어짐...
		Button bt = new Button("나 버튼");
		frame.add(bt); 	//버튼을 윈도우에 컨테이너에 부착하자!

		Checkbox ck = new Checkbox("체크박스",false);
		frame.add(ck); // 체크박스 컨테이너에 부착하기.


		TextArea ta = new TextArea("hello",5,20);
		frame.add(ta); // 텍스트에리어 컨테이너에 부착


		//이미지 넣기
		//image 는 추상클래스이며 플랫폼(win,mac,linux)이 지정한 방식으로 얻을수 있다.
		//플랫폼에 맞게 가져오려면 Toolkit 클래스로부터 자원을 얻어야 한다
		Toolkit kit =Toolkit.getDefaultToolkit(); // static 메서드!! 따라서 클래명으로 접근가능 
		//툴킷은 이미지 로컬상의 경로로 부터 얻을수있다

		//경오 사용시 주의할점: 역슬래시는 윈도우OS 에서만 사용하는 표기이므로,
		//지금 이 자바코드가 모든 OS 실행되려면, 사실 중립적인 경로로 가야한다.. 
		Image img = kit.getImage("C:/workspace/java_workspace/project1026/res/1.png");
		System.out.println("이미지 주소값은"+ img);

 

		
	
	}
}
