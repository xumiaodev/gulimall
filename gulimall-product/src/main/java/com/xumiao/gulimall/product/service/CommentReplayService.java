package com.xumiao.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xumiao.common.utils.PageUtils;
import com.xumiao.gulimall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author xumiao
 * @email xuyongjun96@gmail.com
 * @date 2020-08-25 01:19:29
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

