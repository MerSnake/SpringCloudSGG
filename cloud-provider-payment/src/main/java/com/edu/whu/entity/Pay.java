package com.edu.whu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 支付交易表
 * </p>
 *
 * @author yqx
 * @since 2024-05-24
 */
@TableName("t_pay")
@Schema(title = "支付交易表")
@Data
public class Pay implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(title = "支付流水号")
    private String payNo;

    @Schema(title = "订单流水号")
    private String orderNo;

    @Schema(title = "用户账号ID")
    private Integer userId;

    @Schema(title = "交易金额")
    private BigDecimal amount;

    private Byte deleted;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    @Override
    public String toString() {
        return "Pay{" +
            "id = " + id +
            ", payNo = " + payNo +
            ", orderNo = " + orderNo +
            ", userId = " + userId +
            ", amount = " + amount +
            ", deleted = " + deleted +
            ", createTime = " + createTime +
            ", updateTime = " + updateTime +
        "}";
    }
}
