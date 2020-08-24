package com.xumiao.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xumiao.common.utils.PageUtils;
import com.xumiao.gulimall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author xumiao
 * @email xuyongjun96@gmail.com
 * @date 2020-08-25 01:19:29
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

