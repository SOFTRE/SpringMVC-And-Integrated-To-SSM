package com.xxm.ssm.service;

import com.xxm.ssm.pojo.Items;

import java.util.List;

public interface ItemsService {
    List<Items> findAll();

    void save(Items items);
}
