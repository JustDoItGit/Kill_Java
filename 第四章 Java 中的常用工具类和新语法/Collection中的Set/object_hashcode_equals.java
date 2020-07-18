package Collection中的Set;

public class object_hashcode_equals {
    public static void main(String[] args) {
        A q = new A(1, 2);
        A w = new A(1, 2);
        A q1 = q;
        System.out.println("q equals w: " + q.equals(w)); // 可变类型 注意和int、String这些不可变类型进行区分
        System.out.println("q equals q1: " + q.equals(q1));
        System.out.println("q == w: " + (q == w));
        System.out.println("q == q1: " + (q == q1));
        System.out.println("q's hashcode: " + q.hashCode());
        System.out.println("q'w hashcode: " + w.hashCode());
        System.out.println("q.a == w.a: " + (q.a == w.a));
    }
}

class A {
    int a;
    int b;

    public A(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

