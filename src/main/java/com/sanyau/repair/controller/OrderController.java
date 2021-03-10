package com.sanyau.repair.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sanyau.repair.entity.Order;
import com.sanyau.repair.mapper.OrderMapper;
import com.sanyau.repair.response.Result;
import com.sanyau.repair.service.impl.OrderServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author WildSky
 * @since 2021-03-04
 */
@RestController
@RequestMapping("/repair/order")
public class OrderController {
    @Autowired
    private OrderMapper orderMapper;

    @ApiOperation("获取所有报修单列表")
    @RequestMapping("/all.select")
    public Result getAllOrder(){
        List<Order> orderList = orderMapper.selectList(null);
        if (orderList.isEmpty()){
            return Result.error().data("error","订单结果为空");
        }
        return Result.ok().data("orderList",orderList);
    }
}

