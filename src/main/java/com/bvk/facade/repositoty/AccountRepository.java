package com.bvk.facade.repositoty;

import com.bvk.facade.entity.Account;

public class AccountRepository {

    public Account findById(String id) {
        return new Account();
    }

    public void save(Account account) {}

}
