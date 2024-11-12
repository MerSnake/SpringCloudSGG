package com.edu.whu.mapper;

import com.edu.whu.entity.Account;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yqx
 * @since 2024-11-11
 */
public interface AccountMapper extends BaseMapper<Account> {

    void decrease(@Param("userId") Long userId, @Param("money") Long money);
}
