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
@TableName("t_account")
@Schema(title = "Account对象")
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(title = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(title = "用户id")
    @TableField("user_id")
    private Long userId;

    @Schema(title = "总额度")
    @TableField("total")
    private Long total;

    @Schema(title = "已用余额")
    @TableField("used")
    private Long used;

    @Schema(title = "剩余可用额度")
    @TableField("residue")
    private Long residue;
}
