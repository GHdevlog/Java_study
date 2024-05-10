
public class StudentTest {

	public static void main(String[] args) {
		new Student(2019122104, "Park");
		new Student(2019206028, "Kim");
		new Student(2019153237, "Lee");

		System.out.printf("Student 객체의 수 : %d", Student.count);
	}

}

class Student {
	static int count = 0;

	int id;
	String name;

	Student(int _id, String _name) {
		Student.count++;
		this.id = _id;
		this.name = _name;
	}
}
