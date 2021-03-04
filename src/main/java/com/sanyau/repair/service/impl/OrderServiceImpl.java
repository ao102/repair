package com.sanyau.repair.service.impl;

import com.sanyau.repair.entity.Order;
import com.sanyau.repair.mapper.OrderMapper;
import com.sanyau.repair.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author WildSky
 * @since 2021-03-04
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
