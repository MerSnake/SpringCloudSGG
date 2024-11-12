package com.edu.whu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu.whu.entity.Pay;
import com.edu.whu.entity.PayDTO;

import java.util.List;

/**
 * <p>
 * 支付交易表 服务类
 * </p>
 *
 * @author yqx
 * @since 2024-05-24
 */
public interface IPayService extends IService<Pay> {

    boolean updatePayByDTO(PayDTO payDTO);

    PayDTO getPayDTOById(Integer id);

    List<PayDTO> getAllPayDTO();

}
