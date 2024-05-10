
public class MathTest {

	public static void main(String[] args) {
		System.out.printf("수학의 파이 값 : %f\n", Math.PI);
		System.out.printf("임의 난수 값 : %f\n", Math.random());
		System.out.printf("9.81의 내림값 : %f\n", Math.floor(9.81));
		System.out.printf("4의 제곱근 : %f\n", Math.sqrt(4));
		System.out.printf("2의 3제곱 : %f\n", Math.pow(2, 3));

		System.out.printf("반올림 테스트 : %d\n", Math.round(0.5));
		System.out.printf("반올림 테스트 : %d\n", Math.round(1.5));
		System.out.printf("반올림 테스트 : %d\n", Math.round(2.5));
		System.out.printf("반올림 테스트 : %d\n", Math.round(3.5));
		System.out.printf("반올림 테스트 : %d\n", Math.round(4.5));
	}

}
