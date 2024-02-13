package com.bvk.facade.facade;

import com.bvk.facade.entity.Address;
import com.bvk.facade.entity.Customer;
import com.bvk.facade.repositoty.AddressRepository;
import com.bvk.facade.repositoty.CustomerRepository;

public class CustomerFacade {

    private CustomerRepository customerRepository;

    private AddressRepository addressRepository;

    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);

        for (Address address : customer.getAddresses()) {
            addressRepository.save(address);
        }
    }

}
