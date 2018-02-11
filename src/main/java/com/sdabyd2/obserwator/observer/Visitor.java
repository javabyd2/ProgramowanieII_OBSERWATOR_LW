package com.sdabyd2.obserwator.observer;

public class Visitor implements AnimalAddedListener {
    @Override
    public void onAnimalAdded(Animal animal){
        System.out.println("Nowy dla Visitor: " + animal.getName());
    }
}
