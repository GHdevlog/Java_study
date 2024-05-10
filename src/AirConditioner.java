
public class AirConditioner {

	public static void main(String[] args) {
		turnOn(30);
		turnOn(19);
		turnOn(19);
	}
	
	public static void turnOn(int temper) {
		System.out.printf("현재 온도 %d도", temper);
		if (temper > 25) {
			System.out.println(", 에어컨을 가동합니다.");
		}else{
			System.out.println(", 에어컨 틀지 마세요.");
		}
	}
}
