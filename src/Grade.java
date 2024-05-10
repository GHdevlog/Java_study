
public class Grade {

	public static void main(String[] args) {
		printGrade(100);
		printGrade(96);
		printGrade(86);
		printGrade(70);
		printGrade(65);
		printGrade(60);
		printGrade(55);
	
	}
	
	public static void printGrade(int score) {
		char grade = ' ';
		
		grade = (char)(74 - score/10);
		
		if(score==100){
			System.out.printf("%d점의 학점 : A\n",score, grade);
		}else if (score >= 60) {			
			System.out.printf("%d점의 학점 : %c\n",score, grade);
		}else {
			System.out.printf("%d점의 학점 : F\n",score, grade);
		}
	}
}
