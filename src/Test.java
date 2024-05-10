class Parent {
    int x = 100;

    Parent() {
        this(500);
        System.out.println("End P()");
    }

    Parent(int x) {
        this.x = x;
        System.out.println("End P(x)");
    }

    int getX() {
        return x;
    }
}

class Child extends Parent {
    int x = 4000;

    Child() {
        this(5000);
        System.out.println("End C()");
    }

    Child(int x) {
        this.x = x;
        System.out.println("End C(x)");
    }
}

public class Test {
    public static void main(String[] args) {
        Child obj = new Child();
        System.out.println(obj.getX());
    }
}