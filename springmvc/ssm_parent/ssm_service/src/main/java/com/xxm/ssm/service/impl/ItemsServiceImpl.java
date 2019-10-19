package com.xxm.ssm.service.impl;

import com.xxm.ssm.dao.ItemsDao;
import com.xxm.ssm.pojo.Items;
import com.xxm.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Program: IntelliJ IDEA ssm_parent03
 * @Description: TODO
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-18 22:49:23 周五
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: V1.0
 */
@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;

    @Override
    public List<Items> findAll() {
        List<Items> list = itemsDao.findAll();
        return list;
    }

    @Override
    public void save(Items items) {
        itemsDao.save(items);
    }
}
