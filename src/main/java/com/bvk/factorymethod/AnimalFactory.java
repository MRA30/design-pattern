package com.bvk.factorymethod;

public class AnimalFactory {

    public static Animal create(String type) {
        switch (type) {
            case "tiger":
                return new Tiger();
            case "cat":
                return new Cat();
            case "dog":
                return new Dog();
            default:
                throw new RuntimeException("type not found");
        }
    }

}
