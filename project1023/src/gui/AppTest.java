/*지금까지는 콘솔에서만 자바를 실행시켰으나,
자바도 그래픽 API 를 지원한다.
오늘은 맛만 보자.. 자바의 윈도우와 버튼을 구경해보자 
*/
package gui;
import java.awt.Frame;
import java.awt.Button;
class AppTest{
	public static void main(String[] args) {
	 //자바에서는 윈도우 역할을 해주는 클래스로 Frame을 지원한다
	 Frame frame;//sun에서 제작한 클래스라서, 원본도 없다..
	 			// 따라서 sun 에서 제공하는 공식문서를 보고 위치를 알아내자!
	frame = new Frame(); //윈도우 생성
	frame.setSize(300,400);//생성된 윈도우에 너비,높이주기
	frame.setVisible(true); //프레임의 속성보이게

		//버튼 생성하여, 프레임에 붙이기!!
	Button bt = new Button("나 버튼");
	frame.add(bt);

	}
}
