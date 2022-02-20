public class CircleTest {
	public static void main(String[]args) {
		Circle myFirstCircle = new Circle(1.1, 2.2, 3.3);
		System.out.println("Area 1:"+ myFirstCircle.getArea());
		
		Circle mySecondCircle = new Circle(myFirstCircle);
		System.out.println("Area 2:"+ mySecondCircle.getArea());
		
		Circle myThirdCircle = new Circle(new Point(12.12, 13.13), 4.4);
		System.out.println("Area 3:"+ myThirdCircle.getArea());
		
		Circle myFourthCircle = new Circle();
		System.out.println("Area 4:"+ myFourthCircle.getArea());

		// Testing doesOverlap
		if (myFirstCircle.doesOverlap(mySecondCircle)) {
			System.out.println("First and second circles overlap!");
		} else {
			System.out.println("First and second circles do not overlap!");
		}
		if (myFirstCircle.doesOverlap(myThirdCircle)) {
			System.out.println("First and third circles overlap!");
		} else {
			System.out.println("First and third circles do not overlap!");
		}
		if (mySecondCircle.doesOverlap(myThirdCircle)) {
			System.out.println("Second and third circles overlap!");
		} else {
			System.out.println("Second and third circles do not overlap!");
		}
		
		// Testing equals
		if (myFirstCircle.equals(mySecondCircle)) {
			System.out.println("First and second circles are the same!");
		}
		if (!myFirstCircle.equals(myFourthCircle)) {
			System.out.println("First and fourth circles are not the same!");
		}
		
		// Testing toString
		System.out.println("My third circle: " + myThirdCircle.toString());		
	}

}

