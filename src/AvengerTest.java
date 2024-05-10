
public class AvengerTest {

	public static void main(String[] args) {
		Avenger thor = new Avenger("토르", 150);
		Avenger tanos = new Avenger("타노스", 160);

		thor.punch(tanos);
		thor.punch(tanos);
		thor.punch(tanos);
		tanos.punch(tanos);
		tanos.punch(tanos);
		tanos.punch(tanos);
		tanos.punch(tanos);
		tanos.punch(tanos);
		tanos.punch(tanos);
		tanos.punch(tanos);
	}

}

class Avenger {
	String name;
	int hp;

	Avenger(String s, int i) {
		this.name = s;
		this.hp = i;

	}

	void punch(Avenger enemy) {
		System.out.printf("[%s]의 펀치 ", this.name);
		enemy.hp -= 10;
		System.out.printf("[%s]의 체력 : %d\n", enemy.name, enemy.hp);
	}
}
