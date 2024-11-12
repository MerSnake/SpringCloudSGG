package com.edu.whu.service.impl;

import com.edu.whu.entity.Order;
import com.edu.whu.mapper.OrderMapper;
import com.edu.whu.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yqx
 * @since 2024-11-11
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
