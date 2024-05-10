
public class BMI {

	public static void main(String[] args) {
		
		calcBMI(1.76,81.6);
	}
	public static void calcBMI(double height, double weight) {
		double BMI = weight / (height * height);
		System.out.printf("BMI : %.2f\n", BMI);
		
		String Obesity_level = "";
		if (BMI >= 30) {
			Obesity_level ="비만";
		}else if (BMI >= 25) {
			Obesity_level = "과체중";
		}else if (BMI >= 18.5) {
			Obesity_level = "정상";
		}else{
			Obesity_level = "저체중";
		}
		System.out.printf("비만도 : %s", Obesity_level);
		
	}

}
