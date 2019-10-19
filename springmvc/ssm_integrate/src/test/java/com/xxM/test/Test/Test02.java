package com.xxM.test.Test;

import com.xxM.dao.AccountDao;
import com.xxM.pojo.Account;
import com.xxM.service.AccountService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;

import java.util.List;

/**
 * @Program: IntelliJ IDEA sm
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-17 13:25:17 周四
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
public class Test02 {
    public static void main(String[] args) {
        SqlSessionFactory sqlSessionFactory=new  SqlSessionFactoryBuilder().build(Test02.class.getClassLoader().getResourceAsStream("SqlMapConfig.xml"));
        SqlSession sqlSession=sqlSessionFactory.openSession();
        AccountDao accountServiceProxy=sqlSession.getMapper(AccountDao.class);
        List<Account> all = accountServiceProxy.findAll();
        System.out.println(all);
    }
}
