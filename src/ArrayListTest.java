import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();

		names.add("kim");
		names.add("Lee");
		names.add("Park");
		names.add("Choi");

		names.set(0, "Han");
		names.remove(1);

		for (String name : names) {
			System.out.println(name);
		}

	}

}
