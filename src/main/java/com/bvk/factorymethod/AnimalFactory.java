package com.bvk.factorymethod;

public class AnimalFactory {

    public static Animal create(String type) {
        if (type.equals("tiger")) {
            return new Tiger();
        }else if (type.equals("cat")) {
            return new Cat();
        }else if (type.equals("dog")) {
            return new Dog();
        }else {
            return new Cat();
        }
    }

}
