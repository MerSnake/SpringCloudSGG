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
@TableName("t_storage")
@Schema(title = "Storage对象")
public class Storage implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(title = "产品id")
    @TableField("product_id")
    private Long productId;

    @Schema(title = "总库存")
    @TableField("total")
    private Integer total;

    @Schema(title = "已用库存")
    @TableField("used")
    private Integer used;

    @Schema(title = "剩余库存")
    @TableField("residue")
    private Integer residue;
}
