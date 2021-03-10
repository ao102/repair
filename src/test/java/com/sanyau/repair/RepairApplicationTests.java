package com.sanyau.repair;


import com.sanyau.repair.entity.Admin;
import com.sanyau.repair.entity.Order;
import com.sanyau.repair.mapper.AdminMapper;
import com.sanyau.repair.mapper.OrderMapper;
import com.sanyau.repair.mapper.ReturnMaterialInfoMapper;
import com.sanyau.repair.service.impl.OrderServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class RepairApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private AdminMapper adminMapper;

    @Autowired
//    private OrderServiceImpl orderService;
    private OrderMapper orderMapper;


    @Test
    public void AdminSelectTest(){
        List<Admin> adminList = adminMapper.selectList(null);
        adminList.forEach(System.out::println);
    }

    @Test
    public void getAllOrder(){
//        List<Order> orderList = orderService.getBaseMapper().selectList(null);
        List<Order> orderList = orderMapper.selectList(null);
        orderList.forEach(System.out::println);
    }

}
