package com.edu.whu.api;

import com.edu.whu.response.ResultData;
import com.edu.whu.response.ReturnCodeEnum;
import org.springframework.stereotype.Component;

/**
 * @author yqx
 * @date 2024-11-09 17:28:38
 */
@Component
public class PayFeignSentinelApiFallBack implements PayFeignSentinelApi {

    @Override
    public ResultData getPayByOrderNo(String orderNo) {
        return ResultData.fail(ReturnCodeEnum.RC500.getCode(),"对方服务宕机或不可用，FallBack服务降级o(╥﹏╥)o");
    }
}
