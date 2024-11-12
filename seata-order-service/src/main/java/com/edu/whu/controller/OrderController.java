package com.edu.whu.controller;

import com.edu.whu.entity.Order;
import com.edu.whu.response.ResultData;
import com.edu.whu.service.IOrderService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yqx
 * @since 2024-11-11
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private IOrderService orderService;

    @GetMapping("/create")
    public ResultData create(Order order) {
        orderService.createOrder(order);
        return ResultData.success(order);
    }
}
