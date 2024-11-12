package com.edu.whu.controller;

import com.edu.whu.entity.Pay;
import com.edu.whu.entity.PayDTO;
import com.edu.whu.response.ResultData;
import com.edu.whu.service.IPayService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 支付交易表 前端控制器
 * </p>
 *
 * @author yqx
 * @since 2024-05-24
 */
@RestController
@RequestMapping("/pay")
@Slf4j
@Tag(name = "支付微服务模块",description = "支付CRUD")
public class PayController {

    @Resource
    private IPayService payService;

    @PostMapping("/add")
    @Operation(summary = "新增",description = "新增支付流水方法,json串做参数")
    public ResultData<String> addPay(@RequestBody Pay pay) {
        boolean saved = payService.save(pay);
        return ResultData.success("插入情况：" + saved);
    }

    @DeleteMapping("/del/{id}")
    @Operation(summary = "删除",description = "删除支付流水方法")
    public ResultData<String> deletePay(@PathVariable("id") Integer id) {
        boolean removed = payService.removeById(id);
        return ResultData.success("删除情况：" + removed);
    }

    @PutMapping("/update")
    @Operation(summary = "修改",description = "修改支付流水方法")
    public ResultData<String> updatePay(@RequestBody PayDTO payDTO) {
        boolean updated = payService.updatePayByDTO(payDTO);
        return ResultData.success("修改情况：" + updated);
    }

    @GetMapping("/get/{id}")
    @Operation(summary = "按照ID查流水",description = "查询支付流水方法")
    public ResultData<PayDTO> getPayByID(@PathVariable("id") Integer id) {
        return ResultData.success(payService.getPayDTOById(id));
    }

    @GetMapping("/get/all")
    @Operation(summary = "查询所有流水",description = "查询支付流水方法")
    public ResultData<List<PayDTO>> getAllPay() {
        return ResultData.success(payService.getAllPayDTO());
    }

    @GetMapping("/info")
    public String getInfoByConsul() {
        return "我是8002";
    }


}
