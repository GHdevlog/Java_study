
public class Test01_02 {

	public static void main(String[] args) {
		double time = 12.00;
		double start_position = 1000.0;
		double delta = 1.0/2.0 * -9.81* time*time;
		double end_postion;
		
		end_postion = start_position + delta;
		System.out.printf("자유낙하 물체의 %.2f초 후 위치는 %.2fm 입니다.\n",
				time, end_postion);
	}

}
