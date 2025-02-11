package day26_statics;

public class IPhone {

    public static String brand = "Apple"; // static: "Apple" is brand of all the iphone objects
    public String model, color; // instance: each iphone object has different model and color
    public double price;
    public static String OS = "IOS 17";
    public static String madeIn = "China";
    public static boolean hasBattery = true;
    public static boolean isTouchScreen = true;
    public static boolean isExpensiveToFix = true;

    public IPhone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }


    /*
    public static void printFullInfo(){ // static only accepts statics
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
    }
     */

    public void printPhoneInfo(){ // instance methods accepts both static and instance(non-static)
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }

    public static void printOperatingSystem(){
        System.out.println("Operating System: " + OS);
    }


}
/*
Attributes:
       brand, model, color, price, OS, madeIn, hasBattery, isTouchScreen, isExpensiveToFix
 */