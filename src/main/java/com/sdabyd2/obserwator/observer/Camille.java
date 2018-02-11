package com.sdabyd2.obserwator.observer;

public class Camille implements AnimalAddedListener {

    @Override
    public void onAnimalAdded(Animal animal){
        System.out.println("Camille: " + animal.getName());
    }
}
