package com.edu.whu.service.impl;

import com.edu.whu.entity.Storage;
import com.edu.whu.mapper.StorageMapper;
import com.edu.whu.service.IStorageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yqx
 * @since 2024-11-11
 */
@Service
public class StorageServiceImpl extends ServiceImpl<StorageMapper, Storage> implements IStorageService {

    @Resource
    private StorageMapper storageMapper;

    @Override
    public void decrease(Long productId, int count) {
        storageMapper.decrease(productId, count);
    }
}
