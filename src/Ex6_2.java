
public class Ex6_2 {

	public static void main(String[] args) {
		int[] sales = new int[6];
		
		sales[0] = 52;
		sales[1] = 50;
		sales[2] = 55;
		sales[3] = 42;
		sales[4] = 38;
		
		int sum = 0;
		for(int num : sales) {
			sum += num;
		}
		
		System.out.println(sum);
	}

}
