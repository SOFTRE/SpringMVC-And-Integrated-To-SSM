package com.xxM.dao;

import com.xxM.pojo.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountDao {
    @Insert(" INSERT INTO t_account(name,money) VALUES(#{name},#{money}) ")
    void add(Account account);

    @Select(" SELECT * FROM t_account ")
    List<Account> findAll();

    @Delete(" DELETE FROM t_account WHERE id=#{id}")
    void deleteById(Integer id);
}
