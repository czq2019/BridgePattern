package bridge;

public class Circle extends Shape{
	
	private int x, y, radius;
	
	public Circle(int x, int y, int radius, DrawAPI drawAPI) {
		super(drawAPI);
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	
	public void draw() {
		//System.out.println("��Բ");
		drawAPI.drawCircle(radius,x,y);
	}

}
