package test;

class Point{
	int xPos, yPos;
	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}
	public void showPointInfo() {
		System.out.println("["+xPos+","+yPos+"]");
	}
}

class Circle{
	int rad;
	Point point;
	Circle(Point point, int r){
		 this.point = point;
		 rad = r;
	}
	public void showcircleInfo() {
		System.out.println("["+point.xPos+","+point.yPos+"] "+rad);
	}
}

public class Test {
	public static void main(String[] args) {
		Point p1 = new Point(2,2);
		Circle c = new Circle(p1,4);
		c.showcircleInfo();
	}
}
