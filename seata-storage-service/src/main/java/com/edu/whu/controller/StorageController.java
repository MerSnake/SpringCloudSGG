package com.edu.whu.controller;

import com.edu.whu.response.ResultData;
import com.edu.whu.service.IStorageService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yqx
 * @since 2024-11-11
 */
@RestController
@RequestMapping("/storage")
public class StorageController {

    @Resource
    private IStorageService storageService;

    @GetMapping("/decrease")
    public ResultData decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count) {
        storageService.decrease(productId, count);
        return ResultData.success("扣减库存成功!");
    }

}
