package day27_accessModifiers;

public class AccessModifiers {

    public static int publicData = 200;

    protected static int protectedData = 300;

    static int defaultData = 500;

    private static int privateData = 1000;

    public AccessModifiers() {

    }

    public static void publicMethod(){
        System.out.println("Public");
    }
    protected static void protectedMethod(){
        System.out.println("Protected");
    }
    static void defaultMethod(){
        System.out.println("Default");
    }
    private static void privateMethod(){
        System.out.println("Private");
    }

    public static void main(String[] args) {

        System.out.println(publicData); // public is accessible within same class

        System.out.println(protectedData);// protected is accessible within same class

        System.out.println(defaultData);  // default is accessible within same class

        System.out.println(privateData); // private is accessible within same class

        new AccessModifiers();

        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();



    }

}
