package com.xxM.test.Test;

import com.xxM.pojo.Account;
import com.xxM.service.AccountService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Program: IntelliJ IDEA sm
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-17 11:21:54 周四
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:springmvc.xml")
public class Test {
    @Autowired
    private AccountService accountService;
    @org.junit.Test
    public void method01(){
        List<Account> all = accountService.findAll();
        for (Account account : all) {
            System.out.println(account);
        }
    }
    @org.junit.Test
    public void method02(){
        Account account=new Account();
        account.setName("zl");
        account.setMoney(1.2);
        accountService.save(account);
    }
}
