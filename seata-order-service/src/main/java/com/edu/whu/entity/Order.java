package com.edu.whu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author yqx
 * @since 2024-11-11
 */
@Getter
@Setter
@TableName("t_order")
@Schema(title = "订单表")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(title = "用户id")
    @TableField("user_id")
    private Long userId;

    @Schema(title = "产品id")
    @TableField("product_id")
    private Long productId;

    @Schema(title = "数量")
    @TableField("count")
    private Integer count;

    @Schema(title = "金额")
    @TableField("money")
    private Long money;

    @Schema(title = "订单状态: 0:创建中; 1:已完结")
    @TableField("status")
    private Integer status;
}
