
public class Ex6_8 {

	public static void main(String[] args) {
		int[][] gugudan = new int[10][10];
		
		for (int i=1; i<=9; i++) {
			for (int j=1; j<=9; j++) {
				gugudan[i][j] = i*j;
			}
		}
		
		for (int i=0; i<=9; i++) {
			for (int j=0; j<=9; j++) {
				System.out.printf("%02d ", gugudan[i][j]);
			}
			System.out.println();
		}
	}

}
