import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		Random random = new Random(); // Random 객체 생성
		int n = 10;

		System.out.printf("임의의 정수: %d\n", random.nextInt()); // ① 임의의 정수값 반환
		System.out.printf("0이상 N(%d)미만의 임의의 정수: %d\n", n, random.nextInt(n)); // ② 0 이상 n 미만의 임의의 정수 생성
		System.out.printf("임의의 실수: %f\n", random.nextDouble()); // ③ 임의의 실숫값 반환
		System.out.printf("임의의 참/거짓: %b\n", random.nextBoolean()); // ④ 임의의 참/거짓 반환
	}
}
