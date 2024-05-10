
public class Test01_01 {

	public static void main(String[] args) {
		int num = 374;
		int original_num = num ;
		int huns = num / 100;
		num %= 100;
		int tens = num / 10;
		num %= 10;
		int units = num % 10;
		System.out.printf("정수 %d의 각 자리 총합: %d", original_num, huns + tens + units);
	}

}
