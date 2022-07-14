package com.company;

public class Main {
    public static void main(String[] args) {

    Fish fish = new Fish();
    System.out.println("Here we go, fist we will talk about our fish: ");
    fish.setName("Nemo");
    fish.setBreed("Ocellaris Clownfish");
    fish.setAge(14);

    System.out.println("The name of our fish is: " + fish.getName());
    System.out.println("The breed to which it belong is: " + fish.getBreed());
    System.out.println("It's age is: " + fish.getAge());
/*

*/
    Dog dog = new Dog();
    System.out.println("The next one is our dog: ");
    dog.setName("Rex");
    dog.setColor("Black and Yellow");
    dog.setAge(6);

    System.out.println("Name: " + dog.getName());
    System.out.println("Color: " + dog.getColor());
    System.out.println("Age: " + dog.getAge());
/*

 */
    Parrot parrot = new Parrot();
    System.out.println("The third on the queue is Parrot: ");
    parrot.setName("Tommy");
    parrot.setAge(3);
    parrot.setWeight(1.7);

    System.out.println("Name: " + parrot.getName());
    System.out.println("Age: " + parrot.getAge());
    System.out.println("Weight: "+ parrot.getWeight());
 /*

  */

    Cat cat = new Cat();
    System.out.println("The last one is cat:  ");
    cat.setName("Bucky");
    cat.setAge(1);
    cat.setColor("Blue");

    System.out.println("Name: " + cat.getName());
    System.out.println("Age: " + cat.getAge());
    System.out.println("Color:" + cat.getColor());
    }
}