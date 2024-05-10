
public class CoffeeTest {

	public static void main(String[] args) {
		Coffee c = new Coffee("아메리카노", 3000);
		System.out.printf("%s(%d원) -> ", c.getName(), c.getPrice());
		c.setPrice(c.getPrice() + 500);
		System.out.printf("%s(%d원)\n", c.getName(), c.getPrice());

		System.out.println("물가가 너무 비싸요");
	}

}

class Coffee {
	private String name;
	private int price;

	public Coffee(String n, int p) {
		this.name = n;
		this.price = p;
	}

	public String getName() {
		return this.name;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int p) {
		this.price = p;
	}
}