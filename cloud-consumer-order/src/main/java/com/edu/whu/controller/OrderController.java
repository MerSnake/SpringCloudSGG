package com.edu.whu.controller;

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
@RequestMapping("/order")
public class OrderController {

//    public static String Payment_URL = "http://localhost:8001";
    public static String Payment_URL = "http://cloud-payment-service";

    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/add")
    public ResultData addOrder(PayDTO payDTO) {
        return restTemplate.postForObject(Payment_URL + "/pay/add", payDTO, ResultData.class);
    }

    @GetMapping("/get/{id}")
    public ResultData getPayInfo(@PathVariable("id") Integer id) {
        return restTemplate.getForObject(Payment_URL + "/pay/get/" + id, ResultData.class);
    }

    @GetMapping("/get/info")
    public String getInfo() {
        return restTemplate.getForObject(Payment_URL + "/pay/info", String.class);
    }
}
