
class bicycle {
	String name;
	double weight;
	int price;
}

public class Test07_10 {

	public static void main(String[] args) {

		bicycle b1 = new bicycle();

		b1.name = "로드형 자전거";
		b1.weight = 7.25;
		b1.price = 326000;

		System.out.println(b1);
		System.out.println(b1.name);
		System.out.println(b1.weight);
		System.out.println(b1.price);

	}

}
