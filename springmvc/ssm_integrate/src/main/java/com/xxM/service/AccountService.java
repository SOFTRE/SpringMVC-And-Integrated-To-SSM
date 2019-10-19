package com.xxM.service;

import com.xxM.pojo.Account;

import java.util.List;

public interface AccountService {
    void save(Account account);

    List<Account> findAll();
    void delete(Integer id);
}
