package example;

public class Debugging {
    public static void main(String[] args) {
        System.out.println("In the main method :- Before calling function1.");
        func1();
        System.out.println("In the main method :- After calling function1.");
    }

    private static void func1() {
        System.out.println("In the function1 :- Before calling function2.");
        func2();
        System.out.println("In the function1 :- After calling function2.");

    }

    private static void func2() {
        System.out.println("In the function2.");
    }
}
