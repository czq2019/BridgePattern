package bridge;

public class BridgePatternDemo {
	public static void main(String[] args) {
		//ÊµÀý»¯
		Shape redCircle=new Circle(100,100,10,new RedCircle());
		Shape greenCircle=new Circle(100,100,10,new GreenCircle());
		//»­Ô²
		redCircle.draw();
		greenCircle.draw();
	}
}
