class Circle{
	Point p;
	int rad;
	public Circle(int x, int y, int r) {
		p = new Point(x,y);
		rad = r;
	}
	public void showCircleInfo() {
		p.showPointInfo();
		System.out.println("반지름 정보 ["+rad+"]");
	}
}
public class Point {
	
	int xpos,ypos;
	public Point(int x, int y) {
		xpos = x;
		ypos = y;
	}
	public void showPointInfo() {
		System.out.println("["+xpos+","+ypos+"]");
	}
	public static void main(String[] args) {
		Circle c = new Circle(2,2,4);
		c.showCircleInfo();
	}
}
