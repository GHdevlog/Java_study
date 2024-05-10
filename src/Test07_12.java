
class Cube {
	int radius;

	Cube(int r) {
		this.radius = r;
	}

	double getVolume() {
		return radius * radius * radius;
	}

	double getSurfaceArea() {
		return 6 * radius * radius;
	}
}

public class Test07_12 {

	public static void main(String[] args) {
		Cube c = new Cube(5);
		System.out.println(c.getVolume());
		System.out.println(c.getSurfaceArea());
	}

}
