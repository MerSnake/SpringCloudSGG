package com.edu.whu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.edu.whu.entity.Pay;
import com.edu.whu.entity.PayDTO;
import com.edu.whu.mapper.PayMapper;
import com.edu.whu.service.IPayService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 支付交易表 服务实现类
 * </p>
 *
 * @author yqx
 * @since 2024-05-24
 */
@Service
public class PayServiceImpl extends ServiceImpl<PayMapper, Pay> implements IPayService {

    public boolean updatePayByDTO(PayDTO payDTO) {
        Pay pay = new Pay();
        BeanUtils.copyProperties(payDTO, pay);
        return updateById(pay);
    }

    public PayDTO getPayDTOById(Integer id) {
        Pay pay = getById(id);
        PayDTO payDTO = new PayDTO();
        BeanUtils.copyProperties(pay, payDTO);
        return payDTO;
    }

    public List<PayDTO> getAllPayDTO() {
        return list().stream().map(pay -> {
            PayDTO payDTO = new PayDTO();
            BeanUtils.copyProperties(pay, payDTO);
            return payDTO;
        }).collect(Collectors.toList());
    }
}
