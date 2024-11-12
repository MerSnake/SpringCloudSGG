package com.edu.whu.service;

import com.edu.whu.entity.Account;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yqx
 * @since 2024-11-11
 */
public interface IAccountService extends IService<Account> {

    void decrease(Long userId, Long money);

}
