package day27_accessModifiers;

public class Car {  // Outer Class
    public String make, model, color;
    public int year;
    public double price;
    public static int wheels = 4;

    public class CarEngine { // Inner Class
        public void method() {
            System.out.println(make);
            System.out.println(wheels);
        }
    }

    public static class StaticInnerClass { // Static only accepts static
        public void method() {
            // System.out.println(make);
            System.out.println(wheels);
        }
    }

}

