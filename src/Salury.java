public class Salury {

	public static void main(String[] args) {
		
		printSalury(10000,160);
		printSalury(15000,175);
		printSalury(9000,180);
		printSalury(13000,190);
	}
	
	public static void printSalury(int wage, int hours) {
		
		int salury = wage*hours + (int)(0.5*wage*Math.max(hours-160,0));
		
		if (wage<10000) {
			System.out.println("[에러] 기본 시급이 1만 원보다 작습니다.");
		}else if(hours>180) {
			System.out.println("[에러] 근무시간이 180시간을 초과하였습니다.");
		}else {
			System.out.printf("[급여] %d원\n", salury);
		}
	}
}
