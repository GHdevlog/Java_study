class Cylinder01 {
	int radius;
	int height;

	double getVolume() {
		return radius * radius * Math.PI * height;
	}

	double getSurfaceArea() {
		double circleArea = Math.PI * radius * radius;
		double rectangleArea = height * 2 * Math.PI * radius;

		return 2 * circleArea + rectangleArea;
	}
}

public class Test07_11 {

	public static void main(String[] args) {
		Cylinder01 c = new Cylinder01();
		c.radius = 4;
		c.height = 5;

		System.out.println(c.getVolume());
		System.out.println(c.getSurfaceArea());
	}

}
