package com.sdabyd2.obserwator.observer;

public class Main {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        zoo.registerAnimalAddedListener(new Visitor());

        zoo.addAnimal(new Animal("Kot"));
        zoo.addAnimal(new Animal("Wilk"));


    }
}
