package com.bvk.factorymethod;

public class FactoryMethodApp {
    public static void main(String[] args) {

        // Penggunaan design pattern ini untuk pembuatan objek yang terbatas valuenya dan hanya ada beberapa jenis value;

        Employee manager1 = EmployeeFactory.createManager("Eko");
        Employee staff1 = EmployeeFactory.createStaff("Fajar");

        Animal tiger = AnimalFactory.create("tiger");
        Animal cat = AnimalFactory.create("cat");
        Animal dog = AnimalFactory.create("dog");

    }
}
