public class CircleTester {
	public static void main(String[]args) {
		Circle myFirstCircle = new Circle();
		
		myFirstCircle.setX(1.1);
		myFirstCircle.setY(2.2);
		myFirstCircle.setRadius(3.3);
		System.out.println("Area 1:"+ myFirstCircle.getArea());
		
		Circle mySecondCircle = new Circle();
		
		mySecondCircle.setX(1.1);
		mySecondCircle.setY(2.2);
		mySecondCircle.setRadius(3.3);
		System.out.println("Area 2:"+ mySecondCircle.getArea());
		
		Circle myThirdCircle = new Circle();
		
		myThirdCircle.setX(12.12);
		myThirdCircle.setY(13.13);
		myThirdCircle.setRadius(4.4);
		System.out.println("Area 3:"+ myThirdCircle.getArea());
		
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
		
	}

}
