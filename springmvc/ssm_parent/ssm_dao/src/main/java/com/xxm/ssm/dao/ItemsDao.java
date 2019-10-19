package com.xxm.ssm.dao;

import com.xxm.ssm.pojo.Items;

import java.util.List;

public interface ItemsDao {
    List<Items> findAll();

    void save(Items items);
}
