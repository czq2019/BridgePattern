package bridge;

public class BridgePatternDemo {
	public static void main(String[] args) {
		//ʵ����
		Shape redCircle=new Circle(100,100,10,new RedCircle());
		Shape greenCircle=new Circle(100,100,10,new GreenCircle());
		//��Բ
		redCircle.draw();
		greenCircle.draw();
	}
}
