package day14_forLoop;

public class OverLoadingTheMainMethod {
    public static void main(String[] args) {

        System.out.println("A");
        main(10);
        main(1.5);
        main(false);
    }

    public static void main(int args) {
        System.out.println("B");
    }

    public static void main(double args) {
        System.out.println("C");
    }

    public static void main(boolean args) {
        System.out.println("D");
    }
}
