package com.xumiao.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xumiao.common.utils.PageUtils;
import com.xumiao.gulimall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author xumiao
 * @email xuyongjun96@gmail.com
 * @date 2020-08-25 22:47:00
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

