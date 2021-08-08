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
        looper();
    }

    public static void letsTryThis(int age) {
        System.out.println("Hey, its me from the other method. Anyway, here's the age again: " + age);
    }

    public static void looper() {
        Animal jeff = new Animal("Jeff", 38);
        Animal vanessa = new Animal("Vanessa", 35);
        Animal kali = new Animal("Kali", 10);
        Animal[] names = { jeff, vanessa, kali };

        int i = 0;

        while (i < names.length) {
            System.out.println("index: " + i + " | name: " + names[i].name);
            i = i + 1;
        }

        System.out.println(names[0].name + " lives with " + names[1].name + " and " + names[2].name);
    }
}

class Animal {
    String name = "";
    int age = 0;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}