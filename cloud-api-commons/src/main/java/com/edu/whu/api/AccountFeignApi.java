package com.edu.whu.api;

import com.edu.whu.response.ResultData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yqx
 * @date 2024-11-11 18:34:25
 */
@FeignClient(value = "seata-account-service")
public interface AccountFeignApi {
    //扣减账户余额
    @GetMapping("/account/decrease")
    ResultData decrease(@RequestParam("userId") Long userId, @RequestParam("money") Long money);
}
