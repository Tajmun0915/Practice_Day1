package org.example;


    class Animal {
        public void eat() {
            System.out.println("Some sound");
        }
        public void play() {
            System.out.println("Play the ball");
        }
    }


    class Dog extends Animal {
        // Overrides makeSound method from superclass
        @Override
        public void eat() {
            System.out.println(" Chocolates");
        }

        public void play() {
            System.out.println("Play the ball");
        }
        public void bark() {
            System.out.println("Bark Bark");
        }
    }

    public class OverRiding {
        public static void main(String[] args) {
            Animal genericAnimal = new Animal();
            Dog myDog = new Dog();

            genericAnimal.eat();
            genericAnimal.play();
            myDog.eat();
            myDog.play();
            myDog.bark();

            Animal animalReference = new Dog();
            animalReference.play();
        }
    }

