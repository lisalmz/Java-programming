
public class Circle {
	private double x;
	private double y;
	private double radius;
	
	public void setX (double xVal) {
		x = xVal;
	}
	
	public double getX() {
		return x;
	}
	
	public void setY (double yVal) {
		y = yVal;
	}
	
	public double getY() {
		return y;
	}
	
	public void setRadius (double radiusVal) {
		radius = radiusVal;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return Math.PI*radius*radius;
	}

	public boolean doesOverlap (Circle otherCircle) {
		double dist = Math.sqrt((x-otherCircle.x)*(x-otherCircle.x)+(y-otherCircle.y)*(y-otherCircle.y));
		return (radius+otherCircle.radius) >= dist;
	}
}
