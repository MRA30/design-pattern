package com.bvk.facade.facade;

import com.bvk.facade.entity.Account;
import com.bvk.facade.repositoty.AccountRepository;

public class AccountFacade {

    private AccountRepository accountRepository;

    public void transferAccount(String accountFrom, String accountTo, Long amount) {
        Account accountFromModel = accountRepository.findById(accountFrom);
        Account accountToModel = accountRepository.findById(accountTo);

        accountFromModel.setBalance(accountFromModel.getBalance() - amount);
        accountToModel.setBalance(accountToModel.getBalance() + amount);

        accountRepository.save(accountFromModel);
        accountRepository.save(accountToModel);
    }

}
