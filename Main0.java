class Demo054{
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Demo054 {
    void eat() {
        System.out.println("Dog is eating.");
    }

    void eat(String food) {
        System.out.println("Dog is eating " + food + ".");
    }
}

class Cat extends Demo054{
    void eat(String food) {
        System.out.println("Cat is eating " + food + ".");
    }

    void eat(String food, int quantity) {
        System.out.println("Cat is eating " + quantity + " units of " + food + ".");
    }
}

public class Main0 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.eat("fish");

        Cat cat = new Cat();
        cat.eat("fish");
        cat.eat("fish", 2);
    }
}