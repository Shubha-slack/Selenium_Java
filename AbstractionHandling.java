package Shubhadip.AxisBank;

public class AbstractionHandling {
	
	public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.makeSound();

        AnimalKingdom animal = new Cat(); 
        animal.eat();
        animal.makeSound();
    }
}

abstract class AnimalKingdom {
    void eat() { 
        System.out.println("Character Of Pets:");
    }

    abstract void makeSound(); 
}

class Dog extends AnimalKingdom {
    void makeSound() { 
        System.out.println("Dog : Always Stay Loyal");
    }
}

class Cat extends AnimalKingdom {
    void makeSound() {
        System.out.println(" Cat : Cats  are not loyals to there pet parints.");
    }
}
