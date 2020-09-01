package com.xumiao.gulimall.member.feign;

import com.xumiao.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xumiao
 * @description 调用优惠当中接口
 * @date 2020/8/26 11:09 下午
 */
@FeignClient("gulimall-coupon")
public interface ICouponFeignService {

    @GetMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}
