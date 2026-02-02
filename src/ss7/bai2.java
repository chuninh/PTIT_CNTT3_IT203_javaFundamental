package ss7;

class Student2 {
    String name;
}

public class bai2{
    public static void main(String[] args) {

        int a = 10;
        int b = a;

        b = 20;

        System.out.println("PRIMITIVE:");
        System.out.println("a = " + a); // 10
        System.out.println("b = " + b); // 20
        System.out.println("----------------------");

        Student2 sv1 = new Student2();
        sv1.name = "Nguyen Van A";

        Student2 sv2 = sv1;

        sv2.name = "Tran Thi B";

        System.out.println("REFERENCE:");
        System.out.println("sv1.name = " + sv1.name); // Tran Thi B
        System.out.println("sv2.name = " + sv2.name); // Tran Thi B
    }
}
