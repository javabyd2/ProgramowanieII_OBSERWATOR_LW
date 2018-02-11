package com.sdabyd2.obserwator.observer;

public class Main {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        Visitor visitor = new Visitor();
        CTO cto = new CTO();
        Annie annie = new Annie();
        Camille camille = new Camille();

        zoo.registerAnimalAddedListener(visitor);
        zoo.registerAnimalAddedListener(cto);
        zoo.registerAnimalAddedListener(annie);
        zoo.registerAnimalAddedListener(camille);

        zoo.addAnimal(new Animal("Kot"));
        zoo.addAnimal(new Animal("Wilk"));
        zoo.addAnimal(new Animal("Pies"));
        zoo.unregisterAnimalAddedListener(cto);
        zoo.addAnimal(new Animal("Bear"));
        zoo.addAnimal(new Animal("Kot"));
        zoo.unregisterAnimalAddedListener(visitor);
        zoo.registerAnimalAddedListener(cto);
        zoo.addAnimal(new Animal("Lew"));
        zoo.addAnimal(new Animal("Czapla"));

    }
}
