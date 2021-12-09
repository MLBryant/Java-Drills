import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//	Part 1
        String firstName = "Boba";
        String lastName = "Fett";
        String birthYear = "32 BBY";
        String homeWorld = "Kamino";
        float height = 1.35f;
        int weight = 78;

//  Part 2
        float purse = 150.0f;

        purse -= 24.3;
        purse -= 45;
        purse *= 2;
        purse = purse - purse/10;
        System.out.println(purse);

//  Part 3
        String handle = "black";
        String blade = "purple";
        if (handle.equals("black") && blade.equals("purple")) {
            System.out.println("This one's mine!");
        } else {
            System.out.println("Pass.");
        }

        String ship = "Mellenium Falcon";
        if (ship.equals("Mellenium Falcon")) {
            System.out.println("Let's go!");
        } else {
            System.out.println("I better hide somewhere.");
        }

        int price = 3;
        boolean recommended = true;
        if (price < 5 && recommended == true) {
            System.out.println("I'll try it out.");
        } else {
            System.out.println("Neh.");
        }

        int drinkPrice = 5;
        int drinkSize = 12;
        if (drinkPrice < 1 || drinkSize > 24) {
            System.out.println("I'll take one.");
        } else {
            System.out.println("Neh.");
        }

        fizzBuzz100();

        helloWorld();
        greeting("Mason");
        System.out.println(add(34, 66));
        System.out.println(faveColorFinder("blue"));
        System.out.println((thatsOdd(41)));
        int[] newArr = {12, 345, 13, 65, 764, 54, 66, 654, 99, 100};
        System.out.println(Arrays.toString(bigOrSmall(newArr)));

    }

//  Part 4
//    Conditional checking both modulo 5 & 3 should execute before each individual modulo for program to correctly display "fizzbuzz"
    private static void fizzBuzz100() {
        for (int i = 1; i <= 100; i++) {
            if ((i % 3) == 0)
                System.out.println("fizz");
            else if ((i % 5) == 0)
                System.out.println("buzz");
            else if (((i % 5) == 0) && ((i % 3) == 0))
                System.out.println("fizzbuzz");
            else
                System.out.println(i);
        }
    }

    private static void helloWorld() {
        System.out.println("Hello, World!");
    }

    private static void greeting(String arg) {
        System.out.println("Hello, " + arg);
    }

    private static int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    private static String faveColorFinder(String color) {
        if (color.equals("red")) {
            return "red is a great color";
        } else if (color.equals("green")) {
            return "green is a solid favorite color";
        } else if (color.equals("black")) {
            return "so trendy";
        } else {
            return "you need to evaluate your favorite color choice";
        }
    }

    private static String thatsOdd(int num) {
        if (num % 2 == 0) {
            return "That's not odd!";
        } else {
            return "That is odd indeed!";
        }
    }

    private static String[] bigOrSmall(int[] arr) {
        String[] answers = new String[10];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 100) {
                answers[i] = "big";
            } else {
                answers[i] = "small";
            }
        }
        return answers;
    }
}
