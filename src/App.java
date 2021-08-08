import java.util.Scanner;

// Primitive types
class App {
    public static void main(String[] args) {
        int studentAge = 15;
        System.out.println("Current age is " + studentAge + ". What's the new age?");
        Scanner input = new Scanner(System.in);
        studentAge = input.nextInt();
        System.out.println("New age is " + studentAge + " years old.");
        letsTryThis(studentAge);
        input.close();
    }

    public static void letsTryThis(int age) {
        System.out.println("Hey, its me from the other method. Anyway, here's the age again: " + age);
    }
}