package com.edu.whu.service;

import com.edu.whu.entity.Storage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yqx
 * @since 2024-11-11
 */
public interface IStorageService extends IService<Storage> {

    void decrease(Long productId, int count);
}
