package com.sdabyd2.obserwator.observer;

public class Annie implements AnimalAddedListener {

    @Override
    public void onAnimalAdded(Animal animal){
        System.out.println("Wiadomosc dla Annie: " + animal.getName());
    }
}
