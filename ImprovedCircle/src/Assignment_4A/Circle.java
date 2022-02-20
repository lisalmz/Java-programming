

public class Circle {
	Point center;
	double radius;
	
	public Circle(Point o, double r) {
		center = new Point(o);
		radius = r;
	}
	
	public Circle(double xValue, double yValue, double r) {
		center = new Point(xValue, yValue);
		radius = r;
	}
	
	public Circle() {
		center = new Point(0, 0);
		radius = 1;
	}
	
	public Circle(Circle c) {
		center = new Point(c.getCenter());
		radius = c.getRadius();
	}
	
	public void setCenter(Point p) {
		center = new Point(p);
	}
	
	public Point getCenter() {
		return center;
	}
	
	public void setX (double xVal) {
		center.setX(xVal);
	}
	
	public double getX() {
		return center.getX();
	}
	
	public void setY (double yVal) {
		center.setY(yVal);
	}
	
	public double getY() {
		return center.getY();
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
		double dist = Math.sqrt((center.getX()-otherCircle.getX())*(center.getX()-otherCircle.getX())+(center.getY()-otherCircle.getY())*(center.getY()-otherCircle.getY()));
		return (radius+otherCircle.radius) >= dist;
	}
	
    public String toString() {
        return "Circle x: " + center.getX() + ", y: " + center.getY() + ", radius: " + radius;
    }
    
    public boolean equals(Circle c) {
    	return center.equals(c.getCenter()) && radius == c.getRadius();
    }
}

