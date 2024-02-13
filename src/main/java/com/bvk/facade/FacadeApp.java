package com.bvk.facade;

import com.bvk.facade.entity.Address;
import com.bvk.facade.entity.Customer;
import com.bvk.facade.facade.AccountFacade;
import com.bvk.facade.facade.CustomerFacade;

import java.util.ArrayList;
import java.util.List;

public class FacadeApp {
    public static void main(String[] args) {

        // membuat class baru untuk mengelompokkan logic yang compleks
        // sama seperti service, jadi penghubung antara repository dan controller

        Customer customer = new Customer();
        customer.setId("01");
        customer.setName("Eko");

        Address address1 = new Address();
        address1.setId("01");
        address1.setAddress("Jl. jalan");
        Address address2 = new Address();
        address2.setId("02");
        address2.setAddress("Jl. Kaki");
        List<Address> addresses = new ArrayList<>();
        addresses.add(address1);
        addresses.add(address2);
        customer.setAddresses(addresses);

        CustomerFacade customerFacade = new CustomerFacade();
        customerFacade.saveCustomer(customer);

        // ==============================================================

        AccountFacade accountFacade = new AccountFacade();
        accountFacade.transferAccount("001", "001", 1000000L);
        accountFacade.transferAccount("003", "004", 500000L);

    }
}
