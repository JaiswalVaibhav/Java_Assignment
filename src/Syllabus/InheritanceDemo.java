package Syllabus;

// Single Inheritance

public class InheritanceDemo {

int num1 = 23;

}

class Demo1 extends InheritanceDemo{

    int num2 = 45;

    public int add(){
        return num1+num2;
    }

    public static void main(String[] args) {

        Demo1 demo1 = new Demo1();
        System.out.println(demo1.add());

    }
}


// Multilevel Inheritance

class A{
    void msg(){
        System.out.println("class A");
    }
}

class B extends A{
    void msg1(){
        System.out.println("class B");
    }
}

class C extends B{
    void msg2(){
        System.out.println("class C");
    }
}

class TestDemo{
    public static void main(String[] args) {
        C c = new C();
        c.msg();
        c.msg1();
        c.msg2();
    }
}


// Hierarchical Inheritance

class D {

    void add(int x, int y){
        System.out.println(x+y);
    }

}

class E extends D{

    public static void main(String[] args) {

        E e = new E();
        e.add(56,78);

    }
}

class F extends D{

    public static void main(String[] args) {

        F f = new F();
        f.add(55,67);
    }
}