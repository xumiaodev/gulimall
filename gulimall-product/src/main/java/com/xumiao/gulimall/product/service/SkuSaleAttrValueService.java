package com.xumiao.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xumiao.common.utils.PageUtils;
import com.xumiao.gulimall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author xumiao
 * @email xuyongjun96@gmail.com
 * @date 2020-08-25 01:19:28
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

