package com.edu.whu.controller;

import com.edu.whu.api.PayFeignApi;
import com.edu.whu.entity.PayDTO;
import com.edu.whu.response.ResultData;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author yqx
 * @since 2024/5/27
 */
@RestController
@RequestMapping("/feign")
public class OrderController {

    @Resource
    private PayFeignApi payFeignApi;

    @PostMapping("/pay/add")
    public ResultData<String> addOrder(@RequestBody PayDTO payDTO) {
        return payFeignApi.addPay(payDTO);
    }

    @GetMapping("/pay/get/{id}")
    public ResultData<PayDTO> getPayInfo(@PathVariable("id") Integer id) {
        return payFeignApi.getPayById(id);
    }

    @GetMapping("/pay/info")
    public String getInfo() {
        return payFeignApi.getInfo();
    }
}
