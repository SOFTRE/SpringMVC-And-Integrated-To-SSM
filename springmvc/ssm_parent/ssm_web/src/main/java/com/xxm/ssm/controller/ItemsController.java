package com.xxm.ssm.controller;

import com.xxm.ssm.pojo.Items;
import com.xxm.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Program: IntelliJ IDEA ssm_parent03
 * @Description: TODO
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-18 23:04:19 周五
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: V1.0
 */
@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/list")
    public String findAll(Model model) {
        List<Items> list = itemsService.findAll();
        model.addAttribute("items", list);
        return "items";
    }

    @RequestMapping("/save")
    public String save(Items items) {
        itemsService.save(items);
        return "redirect:/items/list";
    }
}
