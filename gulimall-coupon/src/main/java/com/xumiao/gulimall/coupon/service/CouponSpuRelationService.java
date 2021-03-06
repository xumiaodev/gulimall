package com.xumiao.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xumiao.common.utils.PageUtils;
import com.xumiao.gulimall.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author xumiao
 * @email xuyongjun96@gmail.com
 * @date 2020-08-25 22:38:18
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

