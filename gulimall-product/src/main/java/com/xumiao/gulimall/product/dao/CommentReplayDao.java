package com.xumiao.gulimall.product.dao;

import com.xumiao.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author xumiao
 * @email xuyongjun96@gmail.com
 * @date 2020-08-25 01:19:29
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
