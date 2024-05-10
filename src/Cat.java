
public class Cat {

	String name;
	String breeds;
	double weight;

	void claw() {
		System.out.println();
	}

	void meow() {
		System.out.println();
	}

	public static void main(String[] args) {
		Cat c = new Cat();

		c.name = "네로";
		c.breeds = "페르시안";
		c.weight = 4.37;

		System.out.printf("%s\n", c.name);
		System.out.printf("%s\n", c.breeds);
		System.out.printf("%.2fKg\n", c.weight);
	}

}
