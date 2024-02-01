package com.bvk.factorymethod;

public class EmployeeFactory {

    public static Employee createManager(String nama) {
        return new Employee(nama, "Manager", 10000000);
    }
    public static Employee createStaff(String nama) {
        return new Employee(nama, "Staff", 5000000);
    }

}
